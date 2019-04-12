package me.algorithoms.test;

import me.algorithoms.searchingandsorting.search.Finder;
import me.algorithoms.searchingandsorting.search.impl.BinerySearch;
import me.algorithoms.searchingandsorting.search.impl.JumpSearch;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

/**
 * @author prince.arora
 */
public class SearchTest {

    @Test
    public void binarySearchTest() {
        Finder<Integer> finder = new BinerySearch<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        Integer element = finder.find(7);
        assertEquals(element, new Integer(7));
    }

    @Test
    public void jumpSearch() {
        Finder<Integer> finder = new JumpSearch<>(Arrays.asList(new Integer[]{1,2,6,7,10,20,40,50}));
        Integer element = finder.find(10);
        assertEquals(element, new Integer(10));
    }
}
