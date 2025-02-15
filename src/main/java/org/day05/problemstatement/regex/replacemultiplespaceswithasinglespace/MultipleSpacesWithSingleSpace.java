package org.day05.problemstatement.regex.replacemultiplespaceswithasinglespace;

public class MultipleSpacesWithSingleSpace {
    public static void main(String[] args) {
        String text="This is   an example with   multiple  spaces";
        String regex="\\s+";
        String result = text.replaceAll(regex, " ");
        System.out.println(text);
        System.out.println(result);

    }
}
