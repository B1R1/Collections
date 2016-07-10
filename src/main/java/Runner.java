
import write.ConsoleWriter;
import write.FileWriter;

import static benchmark.ResultsGetter.*;

public class Runner {
    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter();
        ConsoleWriter consoleWriter = new ConsoleWriter();

        System.out.println(Size.SIZE_10K + " elements:");
        toConsole(consoleWriter, Size.SIZE_10K);
        toFile(fileWriter, Size.SIZE_10K);

        System.out.println(Size.SIZE_100K + " elements:");
        toConsole(consoleWriter, Size.SIZE_100K);
        toFile(fileWriter, Size.SIZE_100K);

        System.out.println(Size.SIZE_1000K + " elements:");
        toConsole(consoleWriter, Size.SIZE_1000K);
        toFile(fileWriter, Size.SIZE_1000K);
    }

    private static void toConsole(ConsoleWriter consoleWriter, int size) {
        consoleWriter.write(
                getArrayListResults(size),
                getLinkedListResults(size),
                getHashSetResults(size),
                getTreeSetResults(size));
    }

    private static void toFile(FileWriter fileWriter, int size) {
        fileWriter.write(
                getArrayListResults(size),
                getLinkedListResults(size),
                getHashSetResults(size),
                getTreeSetResults(size));
    }
}

