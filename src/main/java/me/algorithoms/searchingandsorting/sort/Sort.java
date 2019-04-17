package me.algorithoms.searchingandsorting.sort;

import java.util.Comparator;
import java.util.List;

/**
 * @author prince.arora
 */
public abstract class Sort<T> {

    protected Comparator<T> tComparator;
    protected List<T> tList;

    public abstract List<T> sort();
}
