package org.sonuka.chapter1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairs {
    public static void main(String[] args) {
        var intValues = new int[]{1, 3, 6, 7, 8, 9, 5, 3, 4, 5, 5};
        var sum = 6;
        var pairMap = new HashMap<Integer, List<Integer>>();
        for (var index = 0; index < intValues.length; ++index) {
            var i = intValues[index];
            var diff = sum - i;
            if (diff > 0) {
                List<Integer> pairList;
                if (pairMap.containsKey(diff)) {
                    pairList = pairMap.get(diff);
                    for (int pairIndex : pairList) {
                        System.out.println("Pair found: " + index + "," + pairIndex);
                    }
                }
            }
            if (!pairMap.containsKey(i)) {
                pairMap.put(i, new ArrayList<>());

            }
            pairMap.get(i).add(index);

        }

    }
}

