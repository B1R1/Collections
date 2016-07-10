package benchmark;

import java.util.*;

import static java.lang.System.currentTimeMillis;

public class CollectionsTester {

    private static final int ATTEMPTS = 100;

    public static long testAddMethod(Collection<Integer> col) {
        long [] times = new long[ATTEMPTS];
        for (int i = 0; i < ATTEMPTS; i++) {
            times[i] = calculateAddMethodTime(col);
        }
        return getSum(times) / ATTEMPTS;
    }

    public static long testGetMethod(List <Integer> col) {
        long [] times = new long[ATTEMPTS];
        for (int i = 0; i < ATTEMPTS; i++) {
            times[i] = calculateGetMethodTime(col);
        }
        return getSum(times) / ATTEMPTS;
    }

    public static long testRemoveMethod(Collection <Integer> col) {
        long [] times = new long[ATTEMPTS];
        for (int i = 0; i < ATTEMPTS; i++) {
            times[i] = calculateRemoveMethodTime(col);
        }
        return getSum(times) / ATTEMPTS;
    }

    public static long testContainsMethod(Collection <Integer> col) {
        long [] times = new long[ATTEMPTS];
        for (int i = 0; i < ATTEMPTS; i++) {
            times[i] = calculateContainsMethodTime(col);
        }
        return getSum(times) / ATTEMPTS;
    }

    public static long testPopulateMethod(Collection <Integer> col) {
        long [] times = new long[ATTEMPTS];
        for (int i = 0; i < ATTEMPTS; i++) {
            times[i] = calculatePopulateMethodTime(col, col.size());
        }
        return getSum(times) / ATTEMPTS;
    }

    public static long testIteratorAddMethod(List <Integer> col) {
        long [] times = new long[ATTEMPTS];
        for (int i = 0; i < ATTEMPTS; i++) {
            times[i] = calculateIteratorAddMethodTime(col);
        }
        return getSum(times) / ATTEMPTS;
    }

    public static long testIteratorRemoveMethod(List <Integer> col) {
        long [] times = new long[ATTEMPTS];
        for (int i = 0; i < ATTEMPTS; i++) {
            times[i] = calculateIteratorRemoveMethodTime(col);
        }
        return getSum(times) / ATTEMPTS;
    }


    private static long calculateAddMethodTime(Collection<Integer> col) {
        long startTime = currentTimeMillis();
        col.add(col.size());
        return currentTimeMillis() - startTime;
    }

    private static long calculateGetMethodTime(List<Integer> col) {
        long startTime = currentTimeMillis();
        col.get(col.size() / 2);
        return currentTimeMillis() - startTime;
    }

    private static long calculateRemoveMethodTime(Collection<Integer> col) {
        long startTime = currentTimeMillis();
        col.remove(col.size() / 2);
        return currentTimeMillis() - startTime;
    }

    private static long calculateContainsMethodTime(Collection<Integer> col) {
        long startTime = currentTimeMillis();
        col.contains(col.size() / 2);
        return currentTimeMillis() - startTime;
    }

    private static long calculatePopulateMethodTime(Collection<Integer> col, int size) {
        long startTime = currentTimeMillis();
        CollectionsCreator.getFilledCollection(col, size);
        long stopTime = currentTimeMillis();
        return stopTime - startTime;
    }

    private static long calculateIteratorAddMethodTime(List<Integer> col) {
        ListIterator<Integer> it = col.listIterator();
        long startTime = currentTimeMillis();
        it.add(col.size() / 2);
        return currentTimeMillis() - startTime;
    }

    private static long calculateIteratorRemoveMethodTime(List<Integer> col) {
        ListIterator<Integer> it = col.listIterator();
        long startTime = currentTimeMillis();
        it.next();
        it.remove();
        return currentTimeMillis() - startTime;
    }


    private static long getSum(long[] values) {
        long sum = 0;
        for (Long index : values) {
            sum += index;
        }
        return sum;
    }
}
