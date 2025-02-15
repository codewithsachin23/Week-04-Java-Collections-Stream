package org.day05.problemstatement.regex.advancedproblems.validatesocialsecuritynumber;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber {
    public static void main(String[] args) {
        String text="My SSN is 123-45-6789.";
        String regex="[0-9-]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
               System.out.print(matcher.group());
        }
    }
}
