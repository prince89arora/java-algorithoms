package me.algorithoms.searchingandsorting.sort.impl;

import me.algorithoms.searchingandsorting.Helper;
import me.algorithoms.searchingandsorting.sort.Sort;

import java.util.Comparator;
import java.util.List;

/**
 * Quick sort sorting
 * Recursive type
 *
 * @author prince.arora
 */
public class QuickSort<T> extends Sort<T> {

    public QuickSort(Comparator<T> tComparator, List<T> ts) {
        this.tComparator = tComparator;
        this.tList = ts;
    }

    @Override
    public List<T> sort() {
        this.quickSort(0, this.tList.size() - 1);
        return this.tList;
    }

    /**
     * Get new partition for a subset of list.
     *
     * @param low
     * @param high
     * @return
     */
    private int partition(int low, int high) {
        T pivotValue = this.tList.get(high);
        int i = low - 1;

        for (int j=low; j<high; j++) {
            if (this.tComparator.compare(this.tList.get(j), pivotValue) <= 0) {
                i++;
                Helper.swap(this.tList, i, j);
            }
        }
        Helper.swap(this.tList, (i+1), high);
        return i+1;
    }

    /**
     * Initiate Quick sorting.
     * Recursively calling sort based on low and high index.
     *
     * @param low
     * @param high
     */
    private void quickSort(int low, int high) {
        {
            if (low < high)
            {
                int pi = partition(low, high);
                quickSort(low, pi-1);
                quickSort(pi+1, high);
            }
        }
    }

}
