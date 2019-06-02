package me.algorithoms.searchingandsorting.search.impl;

import me.algorithoms.searchingandsorting.search.Finder;

import java.util.Comparator;
import java.util.List;

/**
 * @author prince.arora
 */
public class ExponentialSearch<T> extends Finder<T> {

    public ExponentialSearch(List<T> tList, Comparator<T> tComparator) {
        this.tList = tList;
        this.tComparator = tComparator;
    }

    @Override
    public T find(T t) {
        return null;
    }
}
