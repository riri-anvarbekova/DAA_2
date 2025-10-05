package metrics;

import java.util.HashMap;
import java.util.Map;

public class PerformanceTracker {
    private Map<String, Long> metrics = new HashMap<>();

    public void record(String key, long value) {
        metrics.put(key, value);
    }

    public void printMetrics() {
        System.out.println("Performance Metrics:");
        metrics.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}


