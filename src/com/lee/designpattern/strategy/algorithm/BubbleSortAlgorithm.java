package com.lee.designpattern.strategy.algorithm;

import java.util.Collection;

public class BubbleSortAlgorithm implements SortingAlgorithm {

    @Override
    public void sort(Collection collection) {
        System.out.println("Bubble Sort");
    }
}

