package com.UserRegistrationSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserValidation {

    UserRegistration user;
    boolean result;

    @Before
    public void setup(){
        user = new UserRegistration();
    }
    
    @Test
    public void testFirstNameHappy(){
        result = user.checkFirstName("Arshad");
        System.out.println(result);
        Assert.assertTrue(result);
    }
    
    @Test
    public void testFirstNameSad(){
        result = user.checkFirstName("Ar");
        System.out.println(result);
        Assert.assertFalse(result);
    }

    @Test
    public void testLastNameHappy(){
        result = user.checkLastName("Arshad");
        System.out.println(result);
        Assert.assertTrue(result);
    }
    
    @Test
    public void testLastNameSad(){
        result = user.checkLastName("Ar");
        System.out.println(result);
        Assert.assertFalse(result);
    }

    @Test
    public void testEmailHappy(){
        result = user.checkEmail("arshad@gmail.com");
        System.out.println(result);
        Assert.assertTrue(result);
    }
    
    @Test
    public void testEmailSad(){
        result = user.checkEmail("arshadgmail.com");
        System.out.println(result);
        Assert.assertFalse(result);
    }
  
    @Test
    public void testMobileNumHappy() {
        result = user.checkMobileNum("9717704916");
        System.out.println(result);
        Assert.assertTrue(result);
    }
    
    @Test
    public void testMobileNumSad() {
        result = user.checkMobileNum("009717704916");
        System.out.println(result);
        Assert.assertFalse(result);
    }

    @Test
    public void testPasswordHappy() {
        result = user.checkPassword("arshad123AS@asD");
        System.out.println(result);
        Assert.assertTrue(result);
    }
    
    @Test
    public void testPasswordSad() {
        result = user.checkPassword("Arshad123A@@SasD");
        System.out.println(result);
        Assert.assertFalse(result);
    }

}