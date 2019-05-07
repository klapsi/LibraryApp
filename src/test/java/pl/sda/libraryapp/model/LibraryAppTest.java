package pl.sda.libraryapp.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LibraryAppTest {

    @Test public void shouldAddBookWhenListOfBooksExist() {
        // given
        Library library = new Library();
        library.setBooks(new LinkedList<>());
        Book book = new PaperBookBuilder()//
                .title("W pustyni i w puszczy")//
                .build();
        // when
        library.addBook(book);
        // then
        assertEquals(Arrays.asList(book), library.getBooks());
    }

    @Test public void shouldAddBookWhenListOfBooksIsNull() {
        // given
        Library library = new Library();
        Book book = new PaperBookBuilder()//
                .title("W pustyni i w puszczy")//
                .build();
        // when
        library.addBook(book);
        // then
        assertEquals(Arrays.asList(book), library.getBooks());
    }

}