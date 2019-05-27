package me.algorithoms.searchingandsorting.search;

import java.util.Comparator;
import java.util.List;

/**
 * @author prince.arora
 */
public abstract class Finder<T> {

    protected List<T> tList;

    protected Comparator<T> tComparator;

    public abstract T find(T t);

    public List<T> getList() {
        return this.tList;
    }
}
