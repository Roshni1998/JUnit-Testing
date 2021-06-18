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

        @Test
        public void givenEmailId_WhenProper_ShouldReturnTrue(){
            UserValidation valid = new UserValidation();
            boolean result = valid.isValidEmailId("roshni1234@gmail.com");
            Assert.assertTrue(result);
        }

        @Test
        public void givenEmailId_WhenNotProper_ShouldReturnFalse(){
            UserValidation valid = new UserValidation();
            boolean result = valid.isValidEmailId("roshni1234@gmail.com.innnn");
            Assert.assertFalse(result);
        }

        @Test
        public void givenMobileNo_WhenProper_ShouldReturnTrue(){
            UserValidation valid = new UserValidation();
            boolean result = valid.isValidMobileNo("91 9999888767");
            Assert.assertTrue(result);
        }

        @Test
        public void givenMobileNo_WhenNotProper_ShouldReturnFalse(){
            UserValidation valid = new UserValidation();
            boolean result = valid.isValidMobileNo("919999888767");
            Assert.assertFalse(result);
        }

        @Test
        public void givenPasswordShouldHaveAtLeastOne_UpperCase_ThenReturnTrue(){
            UserValidation valid = new UserValidation();
            boolean result = valid.isValidPassword("A2345678");
            Assert.assertTrue(result);
        }

        @Test
        public void givenPasswordShouldHaveAtLeastOne_UpperCase_OtherwiseReturnFalse(){
            UserValidation valid = new UserValidation();
            boolean result = valid.isValidPassword("12345678");
            Assert.assertFalse(result);
        }

    }


