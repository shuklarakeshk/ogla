package org.sonuka.chapter1;

public class UniqueString {
    public static void main(String[] args) {
        var input = "input";
        boolean[] testArray = new boolean[128];
        char[] charArray = input.toCharArray();
        boolean foundDups = false;
        for (char c : charArray) {
            if (testArray[c]) {
                foundDups = true;
                break;
            } else {
                testArray[c] = true;
            }
        }
        var toPrint = foundDups ? "it is not unique" : "it is unique";
        System.out.println(toPrint);
    }
}
