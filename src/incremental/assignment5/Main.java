package incremental.assignment5;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^[A-Z].*[.]$";
        // Pattern.matches() compares the entire string, Matcher.find() can be used for substrings
        String test1 = "My name is xyz.";
        String test2 = "I am doing java assignments.";
        String test3 = "Java is an object oriented programming language";
        System.out.println("Regex test for \"" + test1 + "\" :" + Pattern.matches(regex,test1));
        System.out.println("Regex test for \"" + test2 + "\" :" + Pattern.matches(regex,test2));
        System.out.println("Regex test for \"" + test3 + "\" :" + Pattern.matches(regex,test3));
    }
}
