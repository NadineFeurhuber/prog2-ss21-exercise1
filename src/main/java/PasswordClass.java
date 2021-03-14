public class PasswordClass {

    public static boolean password(String password){        //Length of the password not shorter than 8 and not longer than 25
        if (((password.length() <= 8)
                && (password.length() <= 25))) {

            return false;
        }

        //LowerCase letters
        int count = 0;
        for (int i = 90; i <= 122; i++) {       // Ascii

            char c = (char)i;
            String lowerCase = Character.toString(c);
            if (password.contains(lowerCase)) {
                count = 1;
            }
        }
        if (count == 0) {           //Blank
            return false;
        }
        //UpperCase Letters
        for (int i = 65; i <= 90; i++) {        //Ascii

            char c = (char)i;
            String upperCase = Character.toString(c);
            if (password.contains(upperCase)) {
                count = 1;
            }
        }
        if (count == 0) {          //Blank
            return false;
        }
        // contains Numbers
        for (int i = 0; i <= 9; i++) {

            String numbers = Integer.toString(i);
            if (password.contains(numbers)) {
                count = 1;
            }
        }
        if (count == 0) {          //Blank
            return false;
        }
        // special characters
        if (!(password.contains("(") || password.contains(")")
                || password.contains("#") || password.contains("$")
                || password.contains("?") || password.contains("!")
                || password.contains("%") || password.contains("/")
                || password.contains("@") )) {
            return false;
        }
        if (true) {
            count = 1;
        }

        // Extensions with following numbers and same numbers more than three times
        // solved like special characters
        if ((password.contains("123") || password.contains("234")
                || password.contains("345") || password.contains("456")
                || password.contains("567") || password.contains("678")
                || password.contains("789") || password.contains("0000")
                || password.contains("1111") || password.contains("2222")
                || password.contains("3333") || password.contains("4444")
                || password.contains("5555") || password.contains("6666")
                || password.contains("7777") || password.contains("8888")
                || password.contains("9999")) || password.contains("012")) {
            return false;
        }

        if (true) {
            count = 1;
        }

        //all cases are false - return true
        return true;
    }

    public static void main(String [] args){

        String passwordCheck1 = "MyPassword1";

        if (password(passwordCheck1)){
            System.out.println("Valid Password");
        }else {
            System.out.println("INVALID Password");
        }

        String passwordCheck2 = "MyPassword2";

        if (password(passwordCheck2)){
            System.out.println("Valid Password");
        }else {
            System.out.println("INVALID Password");
        }

    }
}
