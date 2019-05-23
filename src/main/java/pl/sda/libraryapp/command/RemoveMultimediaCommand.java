package pl.sda.libraryapp.command;

        import pl.sda.libraryapp.command.Command;
        import pl.sda.libraryapp.model.*;
        import java.io.PrintStream;
        import java.util.*;

public class RemoveMultimediaCommand implements Command {

    private final Library<Medium> library;
    private final PrintStream printStream;

    public RemoveMultimediaCommand(Library<Medium> library, PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }

    @Override public void execute() {
        Scanner scanner =new Scanner(System.in);
        printStream.println("Tytuł:");
        String title = scanner.nextLine();
        printStream.println("Typ:");
        String type = scanner.nextLine();
        Optional<Medium> medium = library.getMedia().stream()
                .filter(s -> Objects.equals(s.getTitle(),title))
                .filter(s -> Objects.equals(s.getType(),type))
                .findFirst();
        medium.ifPresent(library::removeMedium);

        if(!medium.isPresent()){
            printStream.println("Brak podanego tytułu w bazie.");
        }
    }
}
