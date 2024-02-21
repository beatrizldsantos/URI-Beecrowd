package URI_JAVA;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI3069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = 1;

        while (true) {
            int beachLength = scanner.nextInt();
            int numberOfIceCreamVendors = scanner.nextInt();

            if (beachLength == 0 && numberOfIceCreamVendors == 0) {
                break;
            }
            List<Interval> intervals = new ArrayList<>();

            for (int i = 0; i < numberOfIceCreamVendors; i++) {
                int start = scanner.nextInt();
                int end = scanner.nextInt();
                intervals.add(new Interval(start, end));
            }

            List<Interval> mergedIntervals = mergeIntervals(intervals);

            System.out.println("Teste " + testNumber);
            for (Interval interval : mergedIntervals) {
                System.out.println(interval.start + " " + interval.end);
            }
            System.out.println();

            testNumber++;
        }
    }

    private static List<Interval> mergeIntervals(List<Interval> intervals) {
        intervals.sort((a, b) -> a.start - b.start);

        List<Interval> mergedIntervals = new ArrayList<>();
        Interval currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);

            if (interval.start <= currentInterval.end) {
                currentInterval.end = Math.max(currentInterval.end, interval.end);
            } else {
                mergedIntervals.add(currentInterval);
                currentInterval = interval;
            }
        }

        mergedIntervals.add(currentInterval);

        return mergedIntervals;
    }

    private static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}