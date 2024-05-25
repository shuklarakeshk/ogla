package org.sonuka.chapter1;

public class StringCompression {
    public static void main(String[] args) {
        var input = "a";
        var output = new StringBuilder();
        var charArray = input.toCharArray();
        char currentchar = charArray[0];
        int count = 1;
        for (int index = 1; index < charArray.length; ++index) {
            if (currentchar == charArray[index]) {
                ++count;
            } else {
                output.append(currentchar).append(count);
                currentchar = charArray[index];
                count = 1;
            }
        }
        output.append(currentchar).append(count);
        System.out.println(output);
    }
}
