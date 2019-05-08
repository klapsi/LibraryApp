package pl.sda.libraryapp.command;

import pl.sda.libraryapp.model.*;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

class CreateMagazineCommandStrategy implements CreateMultimediaStrategy{

    private static final String MAGAZINE = "Magazine";

    @Override
    public Medium createMedium(Scanner scanner, PrintStream printStream) {
        printStream.println("Tytuł:");
        String title = scanner.nextLine();
        printStream.println("Numer:");
        int number = scanner.nextInt();
        printStream.println("Liczba Stron:");
        int pageCount = scanner.nextInt();
        scanner.nextLine();
        return new MagazineBuilder()//
                .title(title)//
                .number(number)//
                .pageCount(pageCount)//
                .build();
    }

    @Override
    public boolean ifTypeCorrect(String type) {
        return Objects.equals(type, MAGAZINE);
    }
}