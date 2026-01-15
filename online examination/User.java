public class User {

    private String username;
    private String password;

    public User() {
        this.username = "student";
        this.password = "1234";
    }

    public boolean login(String u, String p) {
        return username.equals(u) && password.equals(p);
    }

    public void updatePassword(String newPassword) {
        password = newPassword;
        System.out.println("Password updated successfully.");
    }
}
