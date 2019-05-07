package pl.sda.libraryapp.model;


import pl.sda.libraryapp.command.Command;
import pl.sda.libraryapp.command.DisplayMultimediaCommand;
import pl.sda.libraryapp.model.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library<Medium> library = createLibrary();
        Scanner scanner = new Scanner(System.in);
        Map<String, Command> commands = new HashMap<>();
        commands.put("exit", () -> System.exit(0));
        commands.put("display", new DisplayMultimediaCommand(library, System.out));
        while (true) {
            System.out.println("Podaj komendę:");
            String commandName = scanner.nextLine();
            Command command = commands.get(commandName);
            Optional.ofNullable(command).ifPresent(Command::execute);
        }
    }
    private static Library<Medium> createLibrary() {
        Library<Medium> library = new Library<>();
        library.addMedium(new PaperBookBuilder()
                .authorFirstName("Carol")//
                .authorLastName("Lewis")//
                .title("Lew, czarownica i stara szafa")//
                .cover(Cover.HARD)//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Lewis")//
                .authorLastName("Carol")//
                .title("Alicja w Krainie Czarów")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Xueqin")//
                .authorLastName("Cao")//
                .title("Sen czerwonego pawilonu")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Agatha")//
                .authorLastName("Christie")//
                .title("I nie było już nikogo")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Hobbit, czyli tam i z powrotem")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Joanne")//
                .authorLastName("Rowling")//
                .title("Harry Potter i kamień filozoficzny")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Antoine")//
                .authorLastName("de Saint-Exupéry")//
                .title("Mały Książę")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Władca Pierścieni")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Charles")//
                .authorLastName("Dickens")//
                .title("Opowieść o dwóch miastach")//
                .build());
                library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Miguel")//
                .authorLastName("de Cervantes")//
                .title("Don Kichot")//
                .build());


        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Carol")//
                .authorLastName("Lewis")//
                .title("Lew, czarownica i stara szafa")//
                .format(Format.FLAC)//
                .build());

        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Lewis")//
                .authorLastName("Carol")//
                .title("Alicja w Krainie Czarów")//
                .build());

        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Xueqin")//
                .authorLastName("Cao")//
                .title("Sen czerwonego pawilonu")//
                .build());

        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Andy")//
                .authorLastName("Weir")//
                .title("Marsjanin")//
                .build());

        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Gillian")//
                .authorLastName("Flynn")//
                .title("Zaginiona Dziewczyna")//
                .build());

        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Walter")//
                .authorLastName("Isaacson")//
                .title("Steve Jobs")//
                .build());

        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Stephen")//
                .authorLastName("King")//
                .title("11-22-63: Nowela")//
                .build());

        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Harper")//
                .authorLastName("Lee")//
                .title("Zabić Drozda")//
                .build());

        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Patrick")//
                .authorLastName("Rothfuss")//
                .title("Imię Wiatru")//
                .build());

        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Stieg")//
                .authorLastName("Larsson")//
                .title("Dziewczyna z tatuażem")//
                .build());

        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Orson")//
                .authorLastName("Card")//
                .title("Gra Endera")//
                .build());

        library.addMedium(new MagazineBuilder()//
                .title("Motor")//
                .number(15)//
                .pageCount(32)//
                .build());
        library.addMedium(new MagazineBuilder()//
                .title("Newsweek")//
                .number(14)//
                .pageCount(64)//
                .build());
        library.addMedium(new MagazineBuilder()//
                .title("Polityka")//
                .number(13)//
                .pageCount(100)//
                .build());
        library.addMedium(new MovieBuilder()//
                .title("Skazani na Shawshank")//
                .directorFirstName("Frank")//
                .directorLastName("Darabont")//
                .duration(120)//
                .build());
        library.addMedium(new MovieBuilder()//
                .title("Zielona mila")//
                .directorFirstName("Frank")//
                .directorLastName("Darabont")//
                .duration(180)//
                .build());
        library.addMedium(new MovieBuilder()//
                .title("Nietykalni")//
                .directorFirstName("Olivier")//
                .directorLastName("Nakache")//
                .duration(110)//
                .build());
        return library;
    }
}
