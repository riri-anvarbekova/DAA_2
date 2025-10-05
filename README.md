DAA Assignment 2 — Selection Sort (Karina)## Report
The docs/ folder contains the Individual Analysis Report (PDF), which provides a peer review of the partner's algorithm: Binary Insertion Sort.

The report includes the following sections:

Algorithm Overview
A brief description of Binary Insertion Sort, its key features, and differences from Selection Sort.
The algorithm uses binary search to find the insertion position but shifts elements manually.

Complexity Analysis
Detailed analysis of time and space complexity:

Time Complexity: Θ(n log n) for comparisons, Θ(n²) for element shifts; confirmed empirically.
Space Complexity: O(1) auxiliary space (in-place).
Comparison with Selection Sort: fewer comparisons, but shifts remain the main bottleneck.
Code Review & Optimization
Identified bottlenecks:

Main issue: element shifting (O(n) per insertion).
Metrics are correctly implemented and tracked.
Optimization suggestions:
Early exit for nearly sorted arrays.
Use of data structures with faster insertions (LinkedList, tree).
Empirical Results
The report includes tables and graphs:

Time vs n, Comparisons vs n, Swaps vs n
Confirms theoretical complexity.
Main bottleneck is element shifts, which dominate execution time.
Conclusion & Recommendations

Binary Insertion Sort is efficient for small or nearly sorted arrays.
For large arrays, algorithms with fewer shifts (Heap Sort, Merge Sort) are recommended.
Code is readable, but adding comments and Javadoc is advised.
