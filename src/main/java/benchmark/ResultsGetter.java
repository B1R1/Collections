package benchmark;

import java.util.*;

import static benchmark.CollectionsCreator.getFilledCollection;
import static benchmark.CollectionsTester.*;

public class ResultsGetter {

    public static long[] getArrayListResults(int size) {
        List<Integer> list = (List<Integer>) getFilledCollection(new ArrayList<>(), size);
        long[] results = new long[7];
        results[0] = testAddMethod(list);
        results[1] = testGetMethod(list);
        results[2] = testRemoveMethod(list);
        results[3] = testContainsMethod(list);
        results[4] = testPopulateMethod(new ArrayList<>());
        results[5] = testIteratorAddMethod(list);
        results[6] = testIteratorRemoveMethod(list);
        return results;
    }

    public static long[] getLinkedListResults(int size) {
        List<Integer> list = (List<Integer>) getFilledCollection(new LinkedList<>(), size);
        long[] results = new long[7];
        results[0] = testAddMethod(list);
        results[1] = testGetMethod(list);
        results[2] = testRemoveMethod(list);
        results[3] = testContainsMethod(list);
        results[4] = testPopulateMethod(new LinkedList<>());
        results[5] = testIteratorAddMethod(list);
        results[6] = testIteratorRemoveMethod(list);
        return results;
    }

    public static long[] getHashSetResults(int size) {
        Collection<Integer> list = getFilledCollection(new HashSet<>(), size);
        long[] results = new long[4];
        results[0] = testAddMethod(list);
        results[1] = testRemoveMethod(list);
        results[2] = testContainsMethod(list);
        results[3] = testPopulateMethod(new HashSet<>());
        return results;
    }

    public static long[] getTreeSetResults(int size) {
        Collection<Integer> list = getFilledCollection(new TreeSet<>(), size);
        long[] results = new long[4];
        results[0] = testAddMethod(list);
        results[1] = testRemoveMethod(list);
        results[2] = testContainsMethod(list);
        results[3] = testPopulateMethod(new TreeSet<>());
        return results;
    }
}
