package algorithms;

import metrics.PerformanceTracker;

public class SelectionSort {
    private long comparisons = 0;
    private long swaps = 0;

    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                swap(arr, i, minIdx);
                swaps++;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public long getComparisons() { return comparisons; }
    public long getSwaps() { return swaps; }
}

