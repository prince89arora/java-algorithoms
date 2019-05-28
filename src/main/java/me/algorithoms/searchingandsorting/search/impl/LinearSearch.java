package me.algorithoms.searchingandsorting.search.impl;

import me.algorithoms.searchingandsorting.search.Finder;

import java.util.Comparator;
import java.util.List;

/**
 * @author prince.arora
 */
public class LinearSearch<T> extends Finder<T> {

    public LinearSearch(List<T> tList, Comparator<T> tComparator) {
        this.tList = tList;
        this.tComparator = tComparator;
    }

    @Override
    public T find(T t) {
        for( int i=0; i < this.tList.size(); i++ ) {
            if ( this.tComparator.compare(this.tList.get(i), t) == 0 ) {
                return this.tList.get(i);
            }
        }
        return null;
    }
}
