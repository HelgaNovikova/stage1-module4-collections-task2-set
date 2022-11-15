package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> newSet = new HashSet<>();
        for (String item:firstSet){
            if (secondSet.contains(item) && !thirdSet.contains(item)){
                newSet.add(item);
            }
        }
        for (String item:thirdSet){
            if (!secondSet.contains(item) && !firstSet.contains(item)){
                newSet.add(item);
            }
        }
        return newSet;
    }
}
