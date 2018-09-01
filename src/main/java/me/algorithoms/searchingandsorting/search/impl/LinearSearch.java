package me.algorithoms.searchingandsorting.search.impl;

import me.algorithoms.searchingandsorting.search.Finder;

import java.util.List;

/**
 * @author prince.arora
 */
public class LinearSearch<T> extends Finder<T> {

    public LinearSearch(List<T> tList) {
        this.tList = tList;
    }

    @Override
    public T find(T t) {
        for( int i=0; i < this.tList.size(); i++ ) {
            if (this.tList.get(i) == t) {
                return this.tList.get(i);
            }
        }
        return null;
    }
}
