package ru.netology;

public class StatisticService {
    public long sum(long[] items) {
        long result = 0;
        for (long item : items) result += item;
        return result;
    }

    public long avg(long[] items) {
        return sum(items) / items.length;
    }

    public int monthWithMax(long[] items) {
        long max = getMax(items);
        int monthCount=0;
        int monthWithMax=0;
        for (long item : items) {
            monthCount++;
            if (item == max) {
                monthWithMax=monthCount;
            }
        }
        return monthWithMax;
    }

    private long getMax(long[] items) {
        long max = items[0];
        for (long item : items) {
            if (max<item){
                max=item;
            }
        }
        return max;
    }
    public int monthWithMin(long[] items) {
        long min = getMin(items);
        int monthCount=0;
        int monthWithMin=0;
        for (long item : items) {
            monthCount++;
            if (item == min) {
                monthWithMin=monthCount;
            }
        }
        return monthWithMin;
    }

    private long getMin(long[] items) {
        long min = items[0];
        for (long item : items) {
            if (min > item){
                min=item;
            }
        }
        return min;
    }
    public int monthsWithMoreThanAvg(long[] items) {
        long avg = avg(items);
        int monthCount=0;
        for (long item : items) {
           if (item > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }
    public int monthsWithLessThanAvg(long[] items) {
        long avg = avg(items);
        int monthCount=0;
        for (long item : items) {
            if (item < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }
}