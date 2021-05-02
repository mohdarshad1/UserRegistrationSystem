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

}