package com.UserRegistrationSystem;

import java.util.regex.Pattern;

public class UserRegistration {

    private static String first_Name = "[A-Z]{1}[a-z]{2,}";
    private static String last_Name = "[A-Z]{1}[a-z]{2,}";
    private static String emailID = "[a-zA-z0-9]+[a-zA-Z0-9-_[+]?]*[.]?[a-zA-Z0-9-_[+]?]+@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}";
    private static String mobile = "([0-9]{2}[ ]|0)?[6-9][0-9]{9}";
    private static String userPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    public boolean checkFirstName(String firstName){
        return Pattern.matches(first_Name, firstName);
    }

    public boolean checkLastName(String lastName){
        return Pattern.matches(last_Name, lastName);
    }

    public boolean checkEmail(String email){
        return Pattern.matches(emailID, email);
    }

    public boolean checkMobileNum(String mobileNum){
        return Pattern.matches(mobile, mobileNum);
    }

    public boolean checkPassword(String password){
        return Pattern.matches(userPassword, password);
    }

    public void checkException(boolean result){
        try {
            if (result == false)
                throw new CustomException("Invalid Entry");
        }
        catch(CustomException e) {
            System.out.println(e);
        }
    }
}