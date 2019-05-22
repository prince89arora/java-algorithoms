package me.algorithoms.searchingandsorting.sort.impl;

import me.algorithoms.searchingandsorting.Helper;
import me.algorithoms.searchingandsorting.sort.Sort;

import java.util.Comparator;
import java.util.List;

/**
 * @author prince.arora
 */
public class MergeSort<T> extends Sort<T> {

    public MergeSort(Comparator<T> tComparator, List<T> ts) {
        this.tComparator = tComparator;
        this.tList = ts;
    }

    @Override
    public List<T> sort() {
        this.mergeSort(
                0,
                (this.tList.size() - 1)
        );
        return this.tList;
    }

    /**
     * Recursively divide list of data.
     *
     * @param l
     * @param r
     */
    private void mergeSort(int l, int r) {
        if (l < r) {
            int mid = (l+r)/2;
            mergeSort(l, mid);
            mergeSort(mid + 1, r);

            merge(l,r,mid);
        }
    }

    /**
     * Merge/swap item based on left, right and mid position.
     *
     * @param l
     * @param r
     * @param mid
     */
    private void merge(int l, int r, int mid) {
        int i = l;
        int j = r;
        while ( i <= mid && j > mid) {
            if (this.tComparator.compare(this.tList.get(i), this.tList.get(j)) > 0) {
                Helper.swap(this.tList, i, j);
            }
            i++;
            j--;
        }
    }

}
