package pl.sda.libraryapp.command;

import pl.sda.libraryapp.command.Command;
import pl.sda.libraryapp.model.*;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CreateMultimediaCommand implements Command {

    private final Library<Medium> library;
    private final PrintStream printStream;
    private final List<CreateMultimediaStrategy> strategies = Arrays.asList(
            new CreateAudioBookCommandStrategy(),
            new CreatePaperBookCommandStrategy(),
            new CreateMovieCommandStrategy(),
            new CreateMagazineCommandStrategy()
    );

    public CreateMultimediaCommand(Library<Medium> library, PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }

    @Override public void execute() {
        Scanner scanner =new Scanner(System.in);
        printStream.println("Typ:");
        String type = scanner.nextLine();
        Optional<Medium> medium = strategies.stream()
                .filter(s -> s.ifTypeCorrect(type))
                .findFirst()
                .map(s-> s.createMedium(scanner, printStream));
        medium.ifPresent(library::addMedium);
    }
}