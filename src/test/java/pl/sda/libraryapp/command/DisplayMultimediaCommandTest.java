package pl.sda.libraryapp.command;

import org.junit.Test;
import pl.sda.libraryapp.model.Cover;
import pl.sda.libraryapp.model.Library;
import pl.sda.libraryapp.model.Medium;
import pl.sda.libraryapp.model.Movie;
import pl.sda.libraryapp.model.MovieBuilder;
import pl.sda.libraryapp.model.PaperBook;
import pl.sda.libraryapp.model.PaperBookBuilder;
import pl.sda.libraryapp.command.Command;
import pl.sda.libraryapp.command.DisplayMultimediaCommand;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import pl.sda.libraryapp.command.Command;
import pl.sda.libraryapp.command.DisplayMultimediaCommand;
import pl.sda.libraryapp.model.*;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class DisplayMultimediaCommandTest {

    @Test
    public void shouldDisplayMultimediaWhenSomeMultimediaIsAvailable() {
        // given
        PaperBook book = new PaperBookBuilder()//
                .authorFirstName("Henryk")//
                .authorLastName("Sienkiewicz")//
                .title("W pustyni i w puszczy")//
                .cover(Cover.HARD)//
                .pageCount(100)//
                .build();
        Movie movie = new MovieBuilder()//
                .title("W pustyni i w puszczy")//
                .directorFirstName("Andrzej")//
                .directorLastName("Wajda")//
                .duration(100)//
                .build();
        Library<Medium> library = new Library<>();
        library.addMedium(book);
        library.addMedium(movie);
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new DisplayMultimediaCommand(library, printStreamMock);
        // when
        command.execute();
        // then
        verify(printStreamMock, times(1)).println(book);
        verify(printStreamMock, times(1)).println(movie);
    }

}