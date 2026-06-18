public class OrderService {
    private static final int MAX_RETRIES = 10;
    private static final double TAX_RATE = 0.1;
    private static final int TIMEOUT = 60;
    private static final String STATUS = "COMPLETE";

    
    // Service methods
    public void generateReport(String orderId) {
        System.out.println("Generating report for order: " + orderId);
    

    
    public boolean validateUser(String userId) {
        if (userId == null || userId.isEmpty()) return false;
        return userId.startsWith("USR");
    }
}