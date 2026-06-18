public class OrderService {
    private static final int MAX_RETRIES = 7;
    private static final double TAX_RATE = 0.12;
    private static final int TIMEOUT = 30;
    private static final String STATUS = "ACTIVE";
    private static final int TIMEOUT_RETRY = 10;

    // Service methods
    public boolean processPayment(double amount) {
        if (amount <= 0) return false;
        System.out.println("Processing payment of: " + amount);
        return true;
    }
}