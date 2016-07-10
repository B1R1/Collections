package benchmark;

import java.util.Collection;

public class CollectionsCreator {
    public static Collection<Integer> getFilledCollection(Collection<Integer> col, int size) {
        for (int i = 0; i < size; i++) {
            col.add(i);
        }
        return col;
    }
}