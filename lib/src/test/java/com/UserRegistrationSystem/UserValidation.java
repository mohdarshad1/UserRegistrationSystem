package com.UserRegistrationSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserValidation {

    UserRegistration user;

    @Before
    public void setup(){
        user = new UserRegistration();
    }
    
    @Test
    public void testFirstName(){

        boolean isValid;
        isValid = user.checkFirstName("Mohd");
        System.out.println(isValid);
        Assert.assertTrue(isValid);
    }
    
    @Test
    public void testLastName(){

        boolean isValid;
        isValid = user.checkLastName("Arshad");
        System.out.println(isValid);
        Assert.assertTrue(isValid);
    }
    
    @Test
    public void testEmail(){

        boolean isValid;
        isValid = user.checkEmail("mdarshad@gmail.com");
        System.out.println(isValid);
        Assert.assertTrue(isValid);
    }
    
    @Test
    public void testMobileNum(){

        boolean isValid;
        isValid = user.checkMobileNum("91 9717704916");
        System.out.println(isValid);
        Assert.assertTrue(isValid);
    }
    
    @Test
    public void testPassword(){

        boolean isValid;
        isValid = user.checkPassword("arshAd12hty");
        System.out.println(isValid);
        Assert.assertTrue(isValid);

    }
}