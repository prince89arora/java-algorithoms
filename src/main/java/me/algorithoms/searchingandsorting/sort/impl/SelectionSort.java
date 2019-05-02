package me.algorithoms.searchingandsorting.sort.impl;

import me.algorithoms.searchingandsorting.Helper;
import me.algorithoms.searchingandsorting.sort.Sort;

import java.util.Comparator;
import java.util.List;

/**
 * Implementation for selection sort to
 * @author prince.arora
 */
public class SelectionSort<T> extends Sort<T> {

    public SelectionSort(Comparator<T> tComparator, List<T> ts) {
        this.tComparator = tComparator;
        this.tList = ts;
    }

    /**
     * Select elements from list while iteration, and swap them if they are
     * greater then + 1 index.
     *
     * @return
     */
    @Override
    public List<T> sort() {
        for(int i = 0; i < this.tList.size(); i++) {
            int min_indx = i;
            for (int j = i + 1; j < this.tList.size(); j++) {
                if (this.tComparator.compare(this.tList.get(j), this.tList.get(min_indx)) < 0) {
                    min_indx = j;
                }
            }

            Helper.swap(this.tList, min_indx, i);
        }
        return this.tList;
    }
}
