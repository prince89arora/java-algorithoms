package me.algorithoms.test;

import me.algorithoms.searchingandsorting.sort.impl.BubleSort;
import me.algorithoms.searchingandsorting.sort.impl.QuickSort;
import me.algorithoms.searchingandsorting.sort.impl.SelectionSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @author prince.arora
 */
public class SortTest {

    @Test
    public void selectionSortTest() {
        SelectionSort<Integer> sort = new SelectionSort<>(
                new IntegerComparator(),
                Arrays.asList(
                        new Integer[]{2,3,5,6,7,34,12,34}
                )
        );

        List<Integer> sortedList = sort.sort();
        List<Integer> sortedListCompare = Arrays.asList(new Integer[] {2,3,5,6,7,12,34,34});
        assertThat(sortedList, is(sortedListCompare));
    }

    @Test
    public void bubbleSortTest() {
        BubleSort<Integer> bubleSort = new BubleSort<>(
                new IntegerComparator(),
                Arrays.asList(
                        new Integer[]{2,3,5,6,7,34,12,34}
                )
        );
        List<Integer> sortedList = bubleSort.sort();
        List<Integer> sortedListCompare = Arrays.asList(new Integer[] {2,3,5,6,7,12,34,34});
        assertThat(sortedList, is(sortedListCompare));
    }

    @Test
    public void quickSortTest() {
        QuickSort<Integer> quickSort = new QuickSort<>(
                new IntegerComparator(),
                Arrays.asList(
                        new Integer[]{2,3,5,6,7,34,12,34}
                )
        );
        List<Integer> sortedList = quickSort.sort();
        List<Integer> sortedListCompare = Arrays.asList(new Integer[] {2,3,5,6,7,12,34,34});
        assertThat(sortedList, is(sortedListCompare));
    }


    private class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 < o2)
                return -1;
            else if (o2 < o1)
                return 1;
            else
                return 0;
        }
    }
}
