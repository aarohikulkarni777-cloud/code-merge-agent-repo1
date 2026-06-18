public class OrderService {
    private static final int MAX_RETRIES = 5;
    private static final double TAX_RATE = 0.1;
    private static final int TIMEOUT = 45;
    private static final String STATUS = "PENDING";

    public boolean validateUser(String userId) {
        if (userId == null || userId.isEmpty()) return false;
        return userId.startsWith("USR");
    }
}