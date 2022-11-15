package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> newSet = new HashSet<>();
        for (Integer item : sourceList) {
            if (item % 2 == 0) {
                int value = item;
                do {
                    newSet.add(value);
                    value = value / 2;
                }
                while (value >= 1);
            } else {
                newSet.add(item);
                newSet.add(item * 2);
            }
        }
        return newSet;
    }
}
