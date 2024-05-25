package org.sonuka.chapter1;

import java.util.Arrays;

public class OneDiffString {
    public static void main(String[] args) {
        var firstString = "pales";
        var secondString = "pale";
        var firstStrLen = firstString.length();
        var secondStrLen = secondString.length();
        var lenDiff = secondStrLen > firstStrLen ? secondStrLen - firstStrLen : firstStrLen - secondStrLen;
        if (0 == lenDiff || 1 == lenDiff) {
            int[] check = new int[128];
            for (char c : firstString.toCharArray()) {
                check[c]++;
            }
            for (char c : secondString.toCharArray()) {
                check[c]--;
            }
            var diff = Arrays.stream(check).filter(e -> e != 0).count();
            System.out.println(diff);
            if (1 == diff || 2 == diff) {
                System.out.println("strings are one place diff");
            } else {
                System.out.println("strings are not one place diff");
            }
        } else {
            System.out.println("strings are not one place diff");
        }

    }
}