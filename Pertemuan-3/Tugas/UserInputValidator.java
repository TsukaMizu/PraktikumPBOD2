import java.util.regex.Pattern;

public class UserInputValidator {
    private static String usernameValid = "^[a-zA-Z][a-zA-Z0-9_]+";
    private static String emailValid = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
    public static void validateUsername(String username) {
        assert username != null && !username.isEmpty(): "Username Cannot be Empty";
        assert Pattern.matches(usernameValid, username) : "Username Not Valid";
    }

    public static void validateEmail(String email) {
        assert email != null && !email.isEmpty(): "Email Cannot be Empty";
        assert Pattern.matches(emailValid, email) : "Email Not Valid";
    }
    
    public static void validateAge(int age){
        assert 17 <= age && age <= 99: "Age must be between 17 and 99 years";
        
    }
}