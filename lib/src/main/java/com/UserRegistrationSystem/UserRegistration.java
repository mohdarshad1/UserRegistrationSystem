package com.UserRegistrationSystem;

import java.util.regex.Pattern;

public class UserRegistration {

    private static String first_Name = "[A-Z]{1}[a-z]{2,}";

    public boolean checkFirstName(String firstName){

        Pattern p = Pattern.compile(firstName);

        return Pattern.matches(first_Name, firstName);

    }
}