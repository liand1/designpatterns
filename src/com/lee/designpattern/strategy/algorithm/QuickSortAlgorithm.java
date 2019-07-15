package com.lee.designpattern.strategy.algorithm;

import java.util.Collection;

public class QuickSortAlgorithm implements SortingAlgorithm {

    @Override
    public void sort(Collection collection) {
        System.out.println("Quick Sort");
    }
}
