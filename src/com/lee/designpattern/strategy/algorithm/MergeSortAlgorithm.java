package com.lee.designpattern.strategy.algorithm;

import java.util.Collection;

public class MergeSortAlgorithm implements SortingAlgorithm {

    @Override
    public void sort(Collection collection) {
        System.out.println("Merge sort");
    }
}
