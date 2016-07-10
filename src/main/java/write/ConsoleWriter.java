package write;

public class ConsoleWriter implements Writer {

    public void write(long[] resultsAL, long[] resultsLL,long[] resultsHS,long[] resultsTS) {
        writeHead();
        writeArrayListResults(resultsAL);
        writeLinkedListResults(resultsLL);
        writeHashSetResults(resultsHS);
        writeTreeSetResults(resultsTS);
        print("\n");
    }

    private void writeHead() {
        print(String.format("%19s  %9s  %10s  %10s  %9s  %12s  %14s%n", "add", "get",
                "remove", "contains", "populate", "iterator.add", "iterator.remove"));
    }

    private void writeArrayListResults(long[] resultsAL) {
        print(String.format("%-10s", "ArrayList"));
        for (long s : resultsAL) {
            print(String.format("%10s ", s));
        }
        print("\n");
    }

    private void writeLinkedListResults(long[] resultsLL) {
        print(String.format("%-10s", "LinkedList"));
        for (long s : resultsLL) {
            print(String.format("%10s ", s));
        }
        print("\n");
    }

    private void writeHashSetResults(long[] resultsHS) {
        print(String.format("%-10s","HashSet"));
        print(String.format("%10s ", resultsHS[0]));
        print(String.format("%10s ", " "));
        for (int i = 1; i < resultsHS.length; i++) {
            print(String.format("%10s ", resultsHS[i]));
        }
        print("\n");
    }

    private void writeTreeSetResults(long[] resultsTS) {
        print(String.format("%-10s","TreeSet"));
        print(String.format("%10s ", resultsTS[0]));
        print(String.format("%10s ", " "));
        for (int i = 1; i < resultsTS.length; i++) {
            print(String.format("%10s ", resultsTS[i]));
        }
        print("\n");
    }

    private void print(String line) {
        System.out.print(line);
    }
}

