package pl.sda.libraryapp.command;

import pl.sda.libraryapp.model.*;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

class CreateMovieCommandStrategy implements CreateMultimediaStrategy{

    private static final String MOVIE = "Movie";

    @Override
    public Medium createMedium(Scanner scanner, PrintStream printStream) {
        printStream.println("Tytuł:");
        String title = scanner.nextLine();
        printStream.println("Imię reżysera:");
        String directorFirstName = scanner.nextLine();
        printStream.println("Nazwisko reżysera:");
        String directorLastName = scanner.nextLine();
        printStream.println("Czas trwania:");
        int duration = scanner.nextInt();
        scanner.nextLine();
        return new MovieBuilder()//
                .title(title)//
                .directorFirstName(directorFirstName)//
                .directorLastName(directorLastName)//
                .duration(duration)//
                .build();
    }

    @Override
    public boolean ifTypeCorrect(String type) {
        return Objects.equals(type,MOVIE);
    }
}