package me.algorithoms.searchingandsorting.sort.impl;

import me.algorithoms.searchingandsorting.Helper;
import me.algorithoms.searchingandsorting.sort.Sort;

import java.util.Comparator;
import java.util.List;

/**
 * @author prince.arora
 */
public class QuickSort<T> extends Sort<T> {

    public QuickSort(Comparator<T> tComparator, List<T> ts) {
        this.tComparator = tComparator;
        this.tList = ts;
    }

    @Override
    public List<T> sort() {
        int pivot  = (this.tList.size() - 1);
        return null;
    }

    private void quickSort(int pivot, int r, int l) {
        T pivotValue = this.tList.get(pivot);
        for(int i = r; i < l; i++) {
            if (i != pivot) {
                if (this.tComparator.compare(this.tList.get(i), pivotValue) <= 0 &&
                        pivot < i) {
                    Helper.swap(this.tList, i, pivot);
                } else if (this.tComparator.compare(this.tList.get(i), pivotValue) < 0 &&
                    pivot > i) {
                    Helper.swap(this.tList, i, pivot);
                }
            }
        }
    }
}
