package me.algorithoms.searchingandsorting.search;

import java.util.List;

/**
 * @author prince.arora
 */
public abstract class Finder<T> {

    protected List<T> tList;

    public abstract T find(T t);

    public List<T> getList() {
        return this.tList;
    }
}
