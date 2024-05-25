package org.sonuka.chapter1;

public class StringRotation {
    public static void main(String[] args) {
        var input="input";
        var testStr="tinpu";
        var input2times=input+input;
        if(input2times.contains(testStr))
        {
            System.out.println("yes it is rotation");
        }
        else {
            System.out.println("no it is not rotation");
        }
    }
}
