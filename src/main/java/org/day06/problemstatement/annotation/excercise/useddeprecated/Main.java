package org.day06.problemstatement.annotation.excercise.useddeprecated;


public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature(); // Should show a warning during compilation
        api.newFeature();
    }
}
