package me.algorithoms.searchingandsorting.sort.impl;

import me.algorithoms.searchingandsorting.Helper;
import me.algorithoms.searchingandsorting.sort.Sort;

import java.util.Comparator;
import java.util.List;

/**
 * Implementation for insertion sort.
 *
 * @author prince.arora
 */
public class InsertionSort<T> extends Sort<T> {


    public InsertionSort(Comparator<T> tComparator, List<T> ts) {
        this.tComparator = tComparator;
        this.tList = ts;
    }

    @Override
    public List<T> sort() {
        for (int i = 1; i < this.tList.size(); i++) {
            for(int j = (i - 1); j >= 0; j--  ) {
                //check previous elements from i and swap if it is smaller then i.
                if (
                        this.tComparator.compare(
                                this.tList.get(i),
                                this.tList.get(j)
                        ) <= 0
                ) {
                    Helper.swap(this.tList, j, i);
                    break;
                }
            }
        }
        return this.tList;
    }
}
