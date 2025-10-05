package algorithms;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void testEmptyArray() {
        int[] arr = {};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{}, arr);
        assertTrue(sorter.getComparisons() >= 0);
        assertTrue(sorter.getSwaps() >= 0);
    }

    @Test
    void testSingleElement() {
        int[] arr = {5};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{5}, arr);
        assertTrue(sorter.getComparisons() >= 0);
        assertTrue(sorter.getSwaps() >= 0);
    }

    @Test
    void testDuplicates() {
        int[] arr = {2, 2, 2, 2};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{2, 2, 2, 2}, arr);
        assertTrue(sorter.getComparisons() >= 0);
        assertTrue(sorter.getSwaps() >= 0);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        assertTrue(sorter.getComparisons() >= 0);
        assertTrue(sorter.getSwaps() >= 0);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        assertTrue(sorter.getComparisons() >= 0);
        assertTrue(sorter.getSwaps() >= 0);
    }

    @Test
    void testTwoElements() {
        int[] arr1 = {2, 1};
        int[] arr2 = {1, 2};
        SelectionSort sorter1 = new SelectionSort();
        SelectionSort sorter2 = new SelectionSort();
        sorter1.sort(arr1);
        sorter2.sort(arr2);
        assertArrayEquals(new int[]{1, 2}, arr1);
        assertArrayEquals(new int[]{1, 2}, arr2);
    }

    @Test
    void testSmallRandomArray() {
        int[] arr = {4, 2, 5, 1, 3};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testLargeRandomArray() {
        Random rand = new Random(42);
        int[] arr = rand.ints(1000, 0, 1000).toArray();
        int[] expected = arr.clone();
        Arrays.sort(expected);
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
        assertTrue(sorter.getComparisons() >= 0);
        assertTrue(sorter.getSwaps() >= 0);
    }

    @Test
    void testVeryLargeRandomArray() {
        Random rand = new Random(123);
        int[] arr = rand.ints(10000, 0, 10000).toArray();
        int[] expected = arr.clone();
        Arrays.sort(expected);
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }
}

