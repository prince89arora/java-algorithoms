package me.algorithoms.searchingandsorting.search.impl;

import me.algorithoms.searchingandsorting.search.Finder;

import java.util.Comparator;
import java.util.List;

/**
 * @author prince.arora
 */
public class BinerySearch<T> extends Finder<T> {

    public BinerySearch(List<T> tList, Comparator<T> tComparator) {
        this.tList = tList;
        this.tComparator = tComparator;
    }

    private int index = -1;

    @Override
    public T find(T t) {
        searchElement(0 , this.tList.size() - 1, t);
        return (index >= 0) ? this.tList.get(index) : null;
    }

    /**
     * Finding element index in list
     *
     * @param start
     * @param end
     * @param t
     */
    private void searchElement(int start, int end, T t) {
        if (this.tComparator.compare(t, this.tList.get(start)) == 0) {
            this.index = start;
            return;
        }

        if (this.tComparator.compare(t, this.tList.get(end)) == 0) {
            this.index = end;
            return;
        }

        int diff = (start + end)/2;

        if (this.tComparator.compare(this.tList.get(diff), t) == 0) {
            this.index = diff;
            return;
        }

        if ( this.tComparator.compare(this.tList.get(diff), t) > 0 ) {
            searchElement(start, diff, t );
        } else {
            searchElement(diff, end, t);
        }
    }
}
