public class UserService {
    private List<User> users = new ArrayList<>();

    public void createUser(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        users.add(user);
    }

    public User getUser(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public int getUserCount() {
        return users.size();
    }
}