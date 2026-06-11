public class AuthService {
    public boolean login(String username, String password) {
        if (username == null || password == null) { return false ;}
        // Simple authentication logic
        return username.equals("admin") && password.equals("password");
    }

    public void logout() {
        // Logic for logging out the user
        System.out.println("User logged out successfully.");
    }
}