package me.algorithoms.test;

import me.algorithoms.searchingandsorting.search.Finder;
import me.algorithoms.searchingandsorting.search.impl.BinerySearch;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

/**
 * @author prince.arora
 */
public class SearchTest {

    @Test
    public void binerySearchTest() {
        Finder<Integer> finder = new BinerySearch<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        Integer element = finder.find(7);
        assertEquals(element, new Integer(7));
    }
}
