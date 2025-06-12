// User model with basic info
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}


// Handles user persistence (saving to DB)
public class UserRepository {
    public void save(User user) {
      
        System.out.println("User saved: " + user.getName());
    }
}


// Handles sending notifications 
public class NotificationService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Sending welcome email to " + user.getEmail());
    }
}

