package me.algorithoms.test;

import me.algorithoms.searchingandsorting.search.Finder;
import me.algorithoms.searchingandsorting.search.impl.BinerySearch;
import me.algorithoms.searchingandsorting.search.impl.JumpSearch;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author prince.arora
 */
public class SearchTest {

    static IntegerComparator comparator;

    @BeforeClass
    public static void beforeInit() {
        SearchTest.comparator = new IntegerComparator();
    }

    private static class IntegerComparator implements Comparator<Integer> {

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

    @Test
    public void binarySearchTest() {
        Finder<Integer> finder = new BinerySearch<Integer>(
                Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}),
                this.comparator
        );
        Integer element = finder.find(7);
        assertEquals(element, new Integer(7));
    }

    @Test
    public void jumpSearch() {
        Finder<Integer> finder = new JumpSearch<>(
                Arrays.asList(new Integer[]{1,2,6,7,10,20,40,50}), comparator);
        Integer element = finder.find(10);
        assertEquals(element, new Integer(10));
    }
}
