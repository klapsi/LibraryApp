package pl.sda.libraryapp.model;

import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {
        Library<PaperBook> libraryPaper = new Library<PaperBook>();
        Library<AudioBook> libraryAudio = new Library<AudioBook>();
        libraryPaper.addBook(new PaperBookBuilder()//
                .authorFirstName("Carol")//
                .authorLastName("Lewis")//
                .title("Lew, czarownica i stara szafa")//
                .build());
        libraryPaper.addBook(new PaperBookBuilder()//
                .authorFirstName("Lewis")//
                .authorLastName("Carol")//
                .title("Alicja w Krainie Czarów")//
                .build());
        libraryPaper.addBook(new PaperBookBuilder()//
                .authorFirstName("Xueqin")//
                .authorLastName("Cao")//
                .title("Sen czerwonego pawilonu")//
                .build());
        libraryPaper.addBook(new PaperBookBuilder()//
                .authorFirstName("Agatha")//
                .authorLastName("Christie")//
                .title("I nie było już nikogo")//
                .build());
        libraryPaper.addBook(new PaperBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Hobbit, czyli tam i z powrotem")//
                .build());
        libraryPaper.addBook(new PaperBookBuilder()//
                .authorFirstName("Joanne")//
                .authorLastName("Rowling")//
                .title("Harry Potter i kamień filozoficzny")//
                .build());
        libraryPaper.addBook(new PaperBookBuilder()//
                .authorFirstName("Antoine")//
                .authorLastName("de Saint-Exupéry")//
                .title("Mały Książę")//
                .build());
        libraryPaper.addBook(new PaperBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Władca Pierścieni")//
                .build());
        libraryPaper.addBook(new PaperBookBuilder()//
                .authorFirstName("Charles")//
                .authorLastName("Dickens")//
                .title("Opowieść o dwóch miastach")//
                .build());
        libraryPaper.addBook(new PaperBookBuilder()//
                .authorFirstName("Miguel")//
                .authorLastName("de Cervantes")//
                .title("Don Kichot")//
                .build());
        for (PaperBook book : libraryPaper.getBooks()) {
            System.out.println(book);
        }

        System.out.println();


        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("Joanne")//
                .authorLastName("Rowling")//
                .title("Harry Potter i kamień filozoficzny")//
                .build());

        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("George")//
                .authorLastName("Martin")//
                .title("Pieśń Lodu i Ognia")//
                .build());

        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("Trevor")//
                .authorLastName("Noah")//
                .title("Historie z południowoafrykańskiego dzieciństwa")//
                .build());

        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("Andy")//
                .authorLastName("Weir")//
                .title("Marsjanin")//
                .build());

        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("Gillian")//
                .authorLastName("Flynn")//
                .title("Zaginiona Dziewczyna")//
                .format(Format.FLAC)
                .build());

        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("Walter")//
                .authorLastName("Isaacson")//
                .title("Steve Jobs")//
                .build());

        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("Stephen")//
                .authorLastName("King")//
                .title("11-22-63: Nowela")//
                .build());

        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("Harper")//
                .authorLastName("Lee")//
                .title("Zabić Drozda")//
                .build());

        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("Patrick")//
                .authorLastName("Rothfuss")//
                .title("Imię Wiatru")//
                .format(Format.FLAC)
                .build());

        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("Stieg")//
                .authorLastName("Larsson")//
                .title("Dziewczyna z tatuażem")//
                .build());

        libraryAudio.addBook(new AudioBookBuilder()//
                .authorFirstName("Orson")//
                .authorLastName("Card")//
                .title("Gra Endera")//
                .format(Format.FLAC)
                .build());

        for (AudioBook book : libraryAudio.getBooks()) {
            System.out.println(book);
        }
        System.out.println();


    }

}