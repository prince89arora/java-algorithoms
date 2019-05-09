package me.algorithoms.searchingandsorting;

import java.util.List;

/**
 * @author prince.arora
 */
public class Helper {

    /**
     * Swap values in list with from and to indexes.
     *
     * @param tList
     * @param from
     * @param to
     * @param <T>
     */
    public static <T> void swap(List<T> tList, int from, int to) {
        T temp = tList.get(from);
        tList.set(from, tList.get(to));
        tList.set(to, temp);
    }
}
