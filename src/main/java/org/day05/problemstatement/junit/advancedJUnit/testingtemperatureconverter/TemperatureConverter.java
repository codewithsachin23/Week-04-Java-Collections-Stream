package org.day05.problemstatement.junit.advancedJUnit.testingtemperatureconverter;

public class TemperatureConverter {
    public double celsiusToFreinheit(double celsius){
        return (celsius*9/5)+32;
    }
    public double freinheitToCelsius(double freinheit){
        return (freinheit-32)*5/9;

    }

}
