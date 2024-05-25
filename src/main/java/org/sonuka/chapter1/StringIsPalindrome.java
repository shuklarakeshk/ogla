package org.sonuka.chapter1;

import java.util.Arrays;

public class StringIsPalindrome {
    public static void main(String[] args) {
        var input="aaabb";
        var check = new int[128];
        for(var c : input.toCharArray())
        {
            check[c] ^= 1;
        }
        var sum=0;
        if(0 == Arrays.stream(check).sum()|| 1 == Arrays.stream(check).sum())
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not palindrome");
        }


    }
}
