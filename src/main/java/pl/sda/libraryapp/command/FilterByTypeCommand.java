package pl.sda.libraryapp.command;

import pl.sda.libraryapp.model.Library;
import pl.sda.libraryapp.model.Medium;

import java.io.PrintStream;
import java.util.Scanner;

public class FilterByTypeCommand implements Command {

    private final Library<Medium> library;
    private final PrintStream printStream;

    public FilterByTypeCommand(Library<Medium> library, PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }

    @Override public void execute() {
        Scanner scanner = new Scanner(System.in);
        printStream.println("Typ:");
        String type = scanner.nextLine();
        library.getMedia().stream()//
                .filter(m  -> m.getType().equals(type)) // m jak medium ;)
                .forEach(printStream::println);
        //for (Medium medium : library.getMedia()) {
        //    if (medium.getClass().getSimpleName().equals(type)) {
        //        printStream.println(medium);
        //    }
        //}
    }
}
