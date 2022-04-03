package com.company;

import java.util.Comparator;
//is needed to sort collection of rivers by name
//you can implement more comparators if you needed
public class ComparatorByName implements Comparator<River> {
    @Override
    public int compare(River o1, River o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
