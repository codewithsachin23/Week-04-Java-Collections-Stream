package org.day05.problemstatement.regex.replacecensorbadwordsinsentence;

public class CensorBadWordsInSentence {
    public static void main(String[] args) {
        String text="This is a damn bad example with some stupid words.";
        String regex="\\b(damn|stupid)\\b";
        String result = text.replaceAll(regex, "****");
        System.out.println(text);
        System.out.println(result);
    }
}
