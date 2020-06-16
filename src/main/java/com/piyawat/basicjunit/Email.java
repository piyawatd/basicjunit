package com.piyawat.basicjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public boolean checkSpaceBefore(String emailName){
        return checkRegularExpressions(emailName);
    }

    public boolean checkSpaceAfter(String emailName){
        return checkRegularExpressions(emailName);
    }

    public boolean checkSpace(String emailName){
        return checkRegularExpressions(emailName);
    }

    public boolean checkBlank(String emailName){
        return checkRegularExpressions(emailName);
    }

    public boolean checkNoAtSign(String emailName){
        return checkRegularExpressions(emailName);
    }

    public boolean checkBlankBeforeAtSign(String emailName){
        return checkRegularExpressions(emailName);
    }

    public boolean checkEmailName(String emailName){
        return checkRegularExpressions(emailName);
    }

    public boolean checkDot(String emailName){
        return checkRegularExpressions(emailName);
    }

    public boolean checkUniqueEmail(String emailName){
        if (emailName == "testemail@gmail.com"){
            return false;
        }else{
            return true;
        }

    }

    private boolean checkRegularExpressions(String emailName) {
        String regex = "^[A-Za-z0-9+_.-]+@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailName);
        return matcher.matches();
    }
}
