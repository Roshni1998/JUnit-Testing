package com.bridgelabz.regex;

import java.util.regex.Pattern;
/**
 * @author ROSHNI
 * User Registration Problem
 */

public class UserValidation {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{3,15}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([.+-_][0-9a-zA-Z]+)*"+"@([a-zA-Z0-9][-]?)+[.][a-zA-Z]{2,4}+([.][a-zA-Z]{0,2})?$";
    private static final String MOBILE_NUMBER_PATTERN = "(0|91)?\\s([7-9][0-9]{9})";
    private static final String PASSWORD_PATTERN = "^.{8,12}$";

    /*UC-1*/
    //First name starts with Cap and has minimum 3 characters
    public boolean isValidFirstName(String fname) {
        /**
         * @param firstName
         * @return boolean
         */
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname). matches();
    }
    /*UC-2*/
    // Last name starts with Cap and has minimum 3 characters
    public boolean isValidLastName(String lname) {
        /**
         *
         * @param lastName
         * @return boolean
         */
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lname). matches();
    }
    /*UC-3*/
    //Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
    public boolean isValidEmailId(String emailId) {
        /**
         *
         * @param emailId
         * @return boolean
         */
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(emailId). matches();
    }
    /*UC-4*/
    //Country code follow by space and 10 digit number
    /**
     *
     * @param mobileNo
     * @return boolean
     */
    public boolean isValidMobileNo(String mobileNo) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobileNo). matches();
    }
    /*UC-5*/
    //Password should contain minimum 8 Characters
    public static boolean isValidPassword(String password) {
        /**
         *
         * @param password
         * @return boolean
         */
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password). matches();
    }

}

