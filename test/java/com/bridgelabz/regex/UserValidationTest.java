package com.bridgelabz.regex;

import org.junit.Assert;
import org.junit.Test;

    public class UserValidationTest {

        @Test
        public void givenFirstName_WhenProper_ShouldReturnTrue(){
            UserValidation valid = new UserValidation();
            boolean result = valid.isValidFirstName("Roshni");
            Assert.assertTrue(result);
        }

        @Test
        public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
            UserValidation valid = new UserValidation();
            boolean result = valid.isValidFirstName("Ro");
            Assert.assertFalse(result);
        }

        @Test
        public void givenLastName_WhenProper_ShouldReturnTrue(){
            UserValidation valid = new UserValidation();
            boolean result = valid.isValidLastName("Mali");
            Assert.assertTrue(result);
        }

        @Test
        public void givenLastName_WhenNotProper_ShouldReturnFalse(){
            UserValidation valid = new UserValidation();
            boolean result = valid.isValidLastName("ma");
            Assert.assertFalse(result);
        }
    }


