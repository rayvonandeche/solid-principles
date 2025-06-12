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
       // Pretends to save to a database
        System.out.println("User saved: " + user.getName());
    }
}


// Handles sending notifications 
public class NotificationService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Sending welcome email to " + user.getEmail());
    }
}


// Handles logic of registering a user
public class UserService {
    private UserRepository userRepository;
    private NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(String name, String email) {
        User user = new User(name, email);
        userRepository.save(user);
        notificationService.sendWelcomeEmail(user);
    }
}


// Main class to run the application
public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        NotificationService notifier = new NotificationService();
        UserService userService = new UserService(repo, notifier);

        userService.registerUser("Alice", "alice@example.com");
    }
}

