package com.lee.designpattern.strategy;

import com.lee.designpattern.strategy.algorithm.*;

import java.util.Collection;
import java.util.Collections;

public class Context {
    private SortingAlgorithm sortingAlgorithm;

    public void setSortingAlgorithm(
            SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void sort(Collection collection) {
        sortingAlgorithm.sort(collection);
    }

    public static void main(String[] args) {
        Context context = new Context();
        context.setSortingAlgorithm(new QuickSortAlgorithm());
        context.sort(Collections.emptyList());

        context.setSortingAlgorithm(new BubbleSortAlgorithm());
        context.sort(Collections.emptyList());

        context.setSortingAlgorithm(new MergeSortAlgorithm());
        context.sort(Collections.emptyList());

        context.setSortingAlgorithm(new SelectionSortAlgorithm());
        context.sort(Collections.emptyList());
    }

}
