package me.algorithoms.searchingandsorting.sort.impl;

import me.algorithoms.searchingandsorting.sort.Sort;

import java.util.Comparator;
import java.util.List;

/**
 * @author prince.arora
 */
public class BubleSort<T> extends Sort<T> {

    public BubleSort(Comparator<T> tComparator, List<T> ts) {
        this.tComparator = tComparator;
        this.tList = ts;
    }

    @Override
    public List<T> sort() {
        return this.bubbleSort();
    }

    private List<T> bubbleSort() {
        int l = this.tList.size();

        for (int i = 0; i < l; i++) {
            for (int j = i;j < l - 1; j++ ) {
                if (this.tComparator.compare(this.tList.get(j+1), this.tList.get(j)) < 0) {
                    T temp = this.tList.get(j+1);
                    this.tList.set(j+1, this.tList.get(j));
                    this.tList.set(j, temp);
                }
            }
        }

        return this.tList;
    }
}
