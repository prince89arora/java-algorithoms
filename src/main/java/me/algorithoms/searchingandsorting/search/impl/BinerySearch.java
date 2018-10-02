package me.algorithoms.searchingandsorting.search.impl;

import me.algorithoms.searchingandsorting.search.Finder;

import java.util.List;

/**
 * @author prince.arora
 */
public class BinerySearch<T> implements Finder<T> {

    BinerySearch(List<T> tList) { tList =  this.tList }

    @Override
    public T find(T t) {

    }

    private void searchElement(int start, int end) {
        int diff = (start + end)/2;
        for (int i = start; i <= end; i++) {

        }
    }
}
