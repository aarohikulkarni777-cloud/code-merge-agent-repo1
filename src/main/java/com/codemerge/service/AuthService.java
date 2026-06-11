public class AuthService {
    public boolean login(String username, String password) {
        // Simple authentication logic
        return username.equalsIgnoreCase("admin") && password.startsWith("pass");
    }

    public void logout() {
        // Logic for logging out the user
        System.out.println("User logged out successfully.");
    }
}