package me.algorithoms.searchingandsorting.sort.impl;

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
        return null;
    }
}
