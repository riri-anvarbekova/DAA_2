package cli;

import algorithms.SelectionSort;
import metrics.PerformanceTracker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) throws IOException {
        int[] sizes = {100, 1000, 10000, 50000};
        Random rand = new Random();

        FileWriter csvWriter = new FileWriter("selection_sort_benchmark.csv");
        csvWriter.append("size,time_ns,comparisons,swaps\n");

        for (int size : sizes) {
            int[] arr = rand.ints(size, 0, size).toArray();
            SelectionSort sorter = new SelectionSort();

            long start = System.nanoTime();
            sorter.sort(arr);
            long end = System.nanoTime();

            csvWriter.append(String.format("%d,%d,%d,%d\n",
                    size,
                    (end - start),
                    sorter.getComparisons(),
                    sorter.getSwaps()));
        }

        csvWriter.flush();
        csvWriter.close();
        System.out.println("Benchmark completed! Results saved to selection_sort_benchmark.csv");
    }
}


