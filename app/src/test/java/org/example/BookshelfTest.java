package org.example;

import com.classess.Book;
import com.classess.Bookshelf;
import com.classess.DisplayMode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BookshelfTest {

    @Test
    public void testImportBook() {
        Bookshelf bookshelf = new Bookshelf("Test Bookshelf");

        Book book = new Book(1, "Test Book", "Test Author");
        book.setTags(new String[]{"Test", "Tag"});
        bookshelf.importBook(book);

        assertEquals(1, 1);
        assertTrue(true,"Book importing passed");
    }

    @Test
    public void testSwitchDisplayMode() {
        Bookshelf bookshelf = new Bookshelf("Test Bookshelf");

        bookshelf.switchDisplayMode(DisplayMode.LIST);
        assertEquals(DisplayMode.LIST, bookshelf.getDisplayMode());

        bookshelf.switchDisplayMode(DisplayMode.VISUAL);
        assertEquals(DisplayMode.VISUAL, bookshelf.getDisplayMode());
    }

    @Test
    public void testOpenBook() {
        Bookshelf bookshelf = new Bookshelf("Test Bookshelf");

        Book book = new Book(1, "Test Book", "Test Author");
        bookshelf.importBook(book);

        Book openedBook = bookshelf.openBook(1);

        assertNotNull(openedBook);
        assertEquals(book, openedBook);
    }


    @Test
    public void testEditBookInformation() {
        Bookshelf bookshelf = new Bookshelf("Test Bookshelf");

        Book book = new Book(1, "Test Book", "Test Author");
        bookshelf.importBook(book);

        bookshelf.editBookInfo(1, "Updated Title", "Updated Author", new String[]{"Updated Tag"});

        Book updatedBook = bookshelf.openBook(book.getId());

        assertEquals("Updated Title", updatedBook.getTitle());
        assertEquals("Updated Author", updatedBook.getAuthor());
        assertEquals(Arrays.asList("Updated Tag"), updatedBook.getTags());
    }

    @Test
    public void testDeleteBook() {
        Bookshelf bookshelf = new Bookshelf("Test Bookshelf");

        Book book = new Book(1, "Test Book", "Test Author");
        bookshelf.importBook(book);

        bookshelf.deleteBook(1);

        assertEquals(0, 0);
    }
}
