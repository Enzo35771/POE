public class Login {
    private String username;
    private String password;
    final int USERNAME_LIMIT = 5;
    final int PASSWORD_LIMIT = 8;

    public Login(String username, String password) {
        this.password = password;
        this.username = username;

    }

    public boolean checkUserName(String username) {

        return username.length() <= USERNAME_LIMIT && username.contains("_");
    }

    public boolean checkPasswordComplexity(String password) {

        int length = password.length();
        if (length < PASSWORD_LIMIT)
            return false;

        for (char c : password.toUpperCase().toCharArray()) {
            if ('A' <= c || 'Z' <= c)
                return true;
        }
        return false;


    }

// cant get this to work yet
    public String registerUser() {

        if (checkPasswordComplexity(getPassword()) == true) {
            return  "Password successfully captured";
        } if(checkPasswordComplexity(getPassword()) == false) {
            return "Password is not correctly formatted.\n" +
                       "Please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        } if (checkUserName(getUsername()) == true) {
            return "Username successfully captured";
        } if (checkUserName(getUsername()) == false) {
                return "Username is not correctly formatted.\n" +
                       "Please ensure that your username contains an underscore and is no more than 5 characters in length ";
        }
        else return "The user has been registered successfully.";


    }

//    public boolean loginUser(String loginUser, String loginPass) {
//        if
//
//    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

