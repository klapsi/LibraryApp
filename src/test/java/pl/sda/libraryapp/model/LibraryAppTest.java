package pl.sda.libraryapp.model;

import org.junit.Test;
import pl.sda.libraryapp.model.Book;
import pl.sda.libraryapp.model.Library;
import pl.sda.libraryapp.model.PaperBookBuilder;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LibraryAppTest {

    @Test
    public void shouldAddBookWhenListOfBooksExist() {
        // given
        Library library = new Library();
        library.setMedia(new LinkedList<>());
        Book book = new PaperBookBuilder()//
                .title("W pustyni i w puszczy")//
                .build();
        // when
        library.addMedium(book);
        // then
        assertEquals(Arrays.asList(book), library.getMedia());
    }

    @Test
    public void shouldAddBookWhenListOfBooksIsNull() {
        // given
        Library library = new Library();
        Book book = new PaperBookBuilder()//
                .title("W pustyni i w puszczy")//
                .build();
        // when
        library.addMedium(book);
        // then
        assertEquals(Arrays.asList(book), library.getMedia());
    }

}