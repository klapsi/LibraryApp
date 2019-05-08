package pl.sda.libraryapp.command;

import pl.sda.libraryapp.model.Medium;

import java.io.PrintStream;
import java.util.Scanner;

public interface CreateMultimediaStrategy {
    Medium createMedium(Scanner scanner, PrintStream printStream);

    boolean ifTypeCorrect(String type);
}
