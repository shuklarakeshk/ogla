package org.sonuka.chapter1;

import java.util.HashMap;
import java.util.Map;

public class StringPairPermutation {
    public static void main(String[] args) {
        var firstString = "aab";
        var secondString = "aaa";
        if (firstString.length() == secondString.length()) {
            var firstMap = charCount(firstString);
            var secondMap = charCount(secondString);
            if (firstMap.size() == secondMap.size()) {
                var diff = firstMap.entrySet().stream().filter(entry -> !entry.getValue().equals(secondMap.get(entry.getKey()))).findAny();
                if (diff.isPresent()) {
                    System.out.println("Not Permutation");
                } else {
                    System.out.println("Permutation");
                }
            } else {
                System.out.println("Not Permutation");
            }
        } else {
            System.out.println("Not Permutation");
        }
    }

    private static Map<Character, Integer> charCount(String str) {
        var toReturn = new HashMap<Character, Integer>();
        for (var c : str.toCharArray()) {
            if (toReturn.containsKey(c)) {
                var currentCount = toReturn.get(c);
                toReturn.put(c, ++currentCount);
            } else {
                toReturn.put(c, 1);
            }
        }
        return toReturn;
    }
}
