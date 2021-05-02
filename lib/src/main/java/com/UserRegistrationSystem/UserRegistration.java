package com.UserRegistrationSystem;

import java.util.regex.Pattern;

public class UserRegistration {

    private static String first_Name = "[A-Z]{1}[a-z]{2,}";
    private static String last_Name = "[A-Z]{1}[a-z]{2,}";
    private static String emailID = "[a-zA-z0-9]+[a-zA-Z0-9-_[+]?]*[.]?[a-zA-Z0-9-_[+]?]*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}";
    private static String mobile = "([0-9]{2}[ ]|0)?[6-9][0-9]{9}";

    public boolean checkFirstName(String firstName){

        Pattern p = Pattern.compile(firstName);
        return Pattern.matches(first_Name, firstName);

    }
    
    public boolean checkLastName(String lastName){

        Pattern p = Pattern.compile(lastName);
        return Pattern.matches(last_Name, lastName);

    }
    
    public boolean checkEmail(String email){

        Pattern p = Pattern.compile(email);
        return Pattern.matches(emailID, email);
    }
    
    public boolean checkMobileNum(String mobileNum){

        Pattern p = Pattern.compile(mobileNum);
        return Pattern.matches(mobile, mobileNum);
    }
}