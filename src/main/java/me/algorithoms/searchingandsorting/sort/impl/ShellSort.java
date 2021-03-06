package me.algorithoms.searchingandsorting.sort.impl;

import me.algorithoms.searchingandsorting.Helper;
import me.algorithoms.searchingandsorting.sort.Sort;

import java.util.Comparator;
import java.util.List;

/**
 * @author prince.arora
 */
public class ShellSort<T> extends Sort<T> {

    public ShellSort(Comparator<T> tComparator, List<T> ts) {
        this.tComparator = tComparator;
        this.tList = ts;
    }

    @Override
    public List<T> sort() {
        int n = this.tList.size();
        for (int gap = n/2; gap > 0; gap/=2) {
            for (int i = gap; i<n; i++) {
                T backup = this.tList.get(i);
                int j;
                for (j = i; j >= gap && this.tComparator.compare(this.tList.get(j-gap), this.tList.get(i)) > 0; j -= gap) {
                    this.tList.set(j, this.tList.get(j-gap));
                }
                this.tList.set((j), backup);
            }
        }
        return this.tList;
    }
}
