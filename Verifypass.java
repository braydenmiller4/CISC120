import java.util.Arrays;

public class Verifypass {
    /**
     * Checks if given password is at least 8 characters long
     * @param password String from command line
     * @return true if long enough, false otherwise
     */
    public static boolean hasLength (String password){
        if (password.length() < 8) return false;
        return true;
    }

    /**
     * Checks if given password contains a digit (0-9)
     * @param password String from command line
     * @return true if contains a digit, false otherwise
     */
    public static boolean hasDigit (String password){
        int numCheck = 0;
        for (int i = 0; i<=9; i++){
            if (password.contains(Integer.toString(i))){
                numCheck = 1;
                break;
            }
        }
        return numCheck != 0;
    }

    /**
     * Checks if given password contains an uppercase letter
     * @param password String from command line
     * @return true if contains uppercase letter, false otherwise
     */
    public static boolean hasUpperCase (String password){
        int upperCheck = 0;
        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                upperCheck = 1;
                break;
            }
        }
        return upperCheck != 0;
    }

    /**
     * Checks if given password contains a lowercase letter
     * @param password String from command line
     * @return true if contains lowercase letter, false otherwise
     */
    public static boolean hasLowerCase (String password){
        int lowerCheck = 0;
        for (int i = 0; i < password.length(); i++){
            if (Character.isLowerCase(password.charAt(i))){
                lowerCheck = 1;
                break;
            }
        }
        return lowerCheck != 0;
    }

    /**
     * Checks if given password contains a special character (non-letter or non-digit)
     * @param password String from command line
     * @return true if contains special character, false otherwise
     */
    public static boolean hasSpecialChar (String password){
        int charCheck = 0;
        for (int i = 0; i < password.length(); i++){
            if (!Character.isLetterOrDigit(password.charAt(i))){
                charCheck = 1;
                break;
            }
        }
        return charCheck != 0;
    }

    /**
     * Checks if given password is valid (At least 8 characters, has a number, has uppercase and lowercase letter,
     * and has a special character (non-digit or non-letter)
     * @param password String from command line
     * @return true if all password conditions are met, false otherwise
     */
    public static boolean ValidPassword(String password) {
        if (hasLength(password) && hasDigit(password) && hasUpperCase(password)
                && hasLowerCase(password) && hasSpecialChar(password)) return true;
        return false;
    }

    public static void main(String[] args) {
        String password = args[0];

        System.out.println(ValidPassword(password));
    }
}
