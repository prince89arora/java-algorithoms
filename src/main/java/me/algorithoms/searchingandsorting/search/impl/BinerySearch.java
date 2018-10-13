package me.algorithoms.searchingandsorting.search.impl;

import me.algorithoms.searchingandsorting.search.Finder;

import java.util.List;

/**
 * @author prince.arora
 */
public class BinerySearch<T> extends Finder<T> {

    public BinerySearch(List<T> tList) { this.tList = tList; }

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
        if (t == this.tList.get(start)) {
            this.index = start;
            return;
        }

        if (t == this.tList.get(end)) {
            this.index = end;
            return;
        }

        int diff = (start + end)/2;

        if (this.tList.get(diff) == t) {
            this.index = diff;
            return;
        }

        if ( (Integer) this.tList.get(diff) > (Integer) t ) {
            searchElement(start, diff, t );
        } else {
            searchElement(diff, end, t);
        }
    }
}
