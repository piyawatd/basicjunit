package com.piyawat.basicjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public boolean checkSpaceBefore(String emailName){
        return checkRegularExpressions(emailName);
    }

    public boolean checkSpaceAfter(String emailName){
        return false;
    }

    public boolean checkSpace(String emailName){
        return false;
    }

    public boolean checkBlank(String emailName){
        return false;
    }

    public boolean checkNoAtSign(String emailName){
        return false;
    }

    public boolean checkBlankBeforeAtSign(String emailName){
        return false;
    }

    public boolean checkEmailName(String emailName){
        return false;
    }

    public boolean checkDot(String emailName){
        return false;
    }

    public boolean checkUniqueEmail(String emailName){
        return false;
    }

    private boolean checkRegularExpressions(String emailName) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailName);
        return matcher.matches();
    }
}
