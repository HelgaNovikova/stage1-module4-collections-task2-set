package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> newSet = new HashSet<>();
        for (Integer item : sourceList){
                if (Math.pow(item,2) >= lowerBound && Math.pow(item,2)<=upperBound){
                newSet.add((int)Math.pow(item,2));
            }
        }
        return newSet;
    }
}
