package write;

import java.io.*;


public class FileWriter implements Writer {

    private static final String FILE_NAME = "BenchmarkResults.txt";

    public void write(long[] resultsAL, long[] resultsLL,long[] resultsHS,long[] resultsTS) {

        try (PrintWriter pw = new PrintWriter(new java.io.FileWriter (FILE_NAME, true))) {
            writeHead(pw);
            writeArrayListResults(pw, resultsAL);
            writeLinkedListResults(pw, resultsLL);
            writeHashSetResults(pw, resultsHS);
            writeTreeSetResults(pw, resultsTS);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeHead(PrintWriter pw) {
        pw.append(String.format("\n%19s  %9s  %10s  %10s  %9s  %12s  %14s%n", "add", "get",
                "remove", "contains", "populate", "iterator.add", "iterator.remove"));
    }

    private void writeArrayListResults(PrintWriter pw,long[] resultsAL) {
        pw.append(String.format("%-10s", "ArrayList"));
        for (long s : resultsAL) {
            pw.append(String.format("%10s ", s));
        }
        pw.append("\n");
    }

    private void writeLinkedListResults(PrintWriter pw, long[] resultsLL) {
        pw.append(String.format("%-10s", "LinkedList"));
        for (long s : resultsLL) {
            pw.append(String.format("%10s ", s));
        }
        pw.append("\n");
    }

    private void writeHashSetResults(PrintWriter pw, long[] resultsHS) {
        pw.append(String.format("%-10s","HashSet"));
        pw.append(String.format("%10s ", resultsHS[0]));
        pw.append(String.format("%10s ", " "));
        for (int i = 1; i < resultsHS.length; i++) {
            pw.append(String.format("%10s ", resultsHS[i]));
        }
        pw.append("\n");
    }

    private void writeTreeSetResults(PrintWriter pw, long[] resultsTS) {
        pw.append(String.format("%-10s","TreeSet"));
        pw.append(String.format("%10s ", resultsTS[0]));
        pw.append(String.format("%10s ", " "));
        for (int i = 1; i < resultsTS.length; i++) {
            pw.append(String.format("%10s ", resultsTS[i]));
        }
        pw.append("\n");
    }
}