
package pl.sda.libraryapp.model;

        import org.junit.Test;
        import static org.junit.Assert.assertEquals;
        import static org.junit.Assert.assertNotNull;

public class BookBuilderTest {

    @Test public void shouldBuildBookWhenBookDetailsAreDefined() {
        // given
        String authorFirstName = "Henryk";
        String authorLastName = "Sienkiewicz";
        String title = "W pustyni i w puszczy";
        // when
        Book book = new BookBuilder().authorFirstName(authorFirstName)//
                .authorLastName(authorLastName)//
                .title(title)//
                .build();
        // then
        assertNotNull(book);
        assertNotNull(book.getAuthor());
        assertEquals(authorFirstName, book.getAuthor().getFirstName());
        assertEquals(authorLastName, book.getAuthor().getLastName());
        assertEquals(title, book.getTitle());
    }
}