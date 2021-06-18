package com.bridgelabz.regex;

import java.util.regex.Pattern;
/**
 * @author ROSHNI
 * User Registration Problem
 */

public class UserValidation {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{3,15}$";

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

}

