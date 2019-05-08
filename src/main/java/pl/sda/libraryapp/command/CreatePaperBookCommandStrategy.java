package pl.sda.libraryapp.command;

import pl.sda.libraryapp.model.PaperBookBuilder;
import pl.sda.libraryapp.model.Cover;
import pl.sda.libraryapp.model.Medium;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

class CreatePaperBookCommandStrategy implements CreateMultimediaStrategy{

    private static final String PAPER_BOOK = "PaperBook";

    @Override
    public Medium createMedium(Scanner scanner, PrintStream printStream) {
        printStream.println("Tytuł:");
        String title = scanner.nextLine();
        printStream.println("Imię autora:");
        String authorFirstName = scanner.nextLine();
        printStream.println("Nazwisko autora:");
        String authorLastName = scanner.nextLine();
        printStream.println("Okładka:");
        String cover = scanner.nextLine();
        printStream.println("Liczba stron:");
        int pageCount = scanner.nextInt();
        scanner.nextLine();
        return new PaperBookBuilder()//
                .title(title)//
                .authorFirstName(authorFirstName)//
                .authorLastName(authorLastName)//
                .cover(Cover.valueOf(cover))//
                .pageCount(pageCount)//
                .build();
    }

    @Override
    public boolean ifTypeCorrect(String type) {
        return Objects.equals(type,PAPER_BOOK);
    }
}
