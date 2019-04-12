package me.algorithoms.searchingandsorting.search.impl;

import me.algorithoms.searchingandsorting.search.Finder;

import java.util.Arrays;
import java.util.List;

/**
 * @author prince.arora
 */
public class JumpSearch<T> extends Finder<T> {

    public JumpSearch(List<T> tList) {
        this.tList = tList;
    }

    public static void main(String[] args) {
        Finder<Integer> finder = new JumpSearch<>(Arrays.asList(new Integer[]{1,2,6,7,10,20,40,50,52,53,54,56,57,58}));
        Integer element = finder.find(10);
        System.out.printf("el  " + element);
    }

    @Override
    public T find(T t) {
        return this.jumpSearch(t);
    }

    private T jumpSearch(T t) {
        int prev = 0;
        int size = this.tList.size();

        int step = (int) Math.floor(Math.sqrt(size));

        while( (Integer) tList.get(Math.min(step, size)-1) < (Integer)t ) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(prev));
            if (prev > size) {
                return null;
            }
        }

        while ((Integer) tList.get(prev) < (Integer) t) {
            prev++;
            if (prev == Math.min(step, size)) {
                return null;
            }
        }

        if ( (Integer) tList.get(prev) == (Integer) t ) {
            return tList.get(prev);
        }
        return null;
    }
}
