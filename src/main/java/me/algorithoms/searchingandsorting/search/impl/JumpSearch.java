package me.algorithoms.searchingandsorting.search.impl;

import me.algorithoms.searchingandsorting.search.Finder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author prince.arora
 */
public class JumpSearch<T> extends Finder<T> {

    public JumpSearch(List<T> tList, Comparator<T> tComparator) {
        this.tComparator = tComparator;
        this.tList = tList;
    }

    @Override
    public T find(T t) {
        return this.jumpSearch(t);
    }

    private T jumpSearch(T t) {
        int prev = 0;
        int size = this.tList.size();

        int step = (int) Math.floor(Math.sqrt(size));

        while(this.tComparator.compare(tList.get(Math.min(step, size)-1), t) < 0) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(prev));
            if (prev > size) {
                return null;
            }
        }

        while (this.tComparator.compare(tList.get(prev), t) < 0) {
            prev++;
            if (prev == Math.min(step, size)) {
                return null;
            }
        }

        if ( this.tComparator.compare(this.tList.get(prev), t) == 0) {
            return tList.get(prev);
        }
        return null;
    }
}
