import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PaymentProcessor {

    public boolean processPayment(double amount) {
        System.out.println("Processing payment of " + amount);
        return true;
    }

    public String exportReceipt(Map<String, Object> data) throws Exception {
        return new ObjectMapper().writeValueAsString(data);
    }
}
