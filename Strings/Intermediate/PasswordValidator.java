package Strings.Intermediate;

public class PasswordValidator {
    public static void main(String[] args) {
        String str = " MyP@ss123 ";
        
        str.trim();

        if (str.indexOf("@") != -1 || str.indexOf("#") != -1) {
            System.out.println("Contains @ or #");
        }
        if (str.length() >= 8) {
            System.out.println("Has at least 8 characters ");
        }

        System.out.println(str.substring(0,3).toUpperCase() + str.substring(3));
        System.out.println((str.substring(0,3).toUpperCase() + str.substring(3)).equals("MYP@ss123"));
        
    }
    
}