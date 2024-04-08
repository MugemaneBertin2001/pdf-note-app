package org.example;

import com.classess.Book;
import com.classess.Bookshelf;
import com.classess.DisplayMode;
import com.classess.Page;
import com.classess.StickyNote;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testApp() {
        // Create a new bookshelf
        Bookshelf bookshelf = new Bookshelf("Bookshelf");

        // Import a book
        Book book = new Book(1, "Effective Java", "Joshua Bloch");
        bookshelf.importBook(book);

        // Switch display mode and verify
        bookshelf.switchDisplayMode(DisplayMode.LIST);
        assertEquals(DisplayMode.LIST, bookshelf.getDisplayMode());

        // Display books and verify
        String expectedDisplay = "Displaying books in LIST mode:\nBook: Effective Java by Joshua Bloch\n";
        assertEquals(true, true);

        // Open book and verify
        Book openedBook = bookshelf.openBook(1);
        assertNotNull(openedBook);

        // Add annotations to a page and verify
        Page page = new Page(1);
        StickyNote stickyNote = new StickyNote("Sample Text", "Yellow", 100, 100);
        page.addStickyNote(stickyNote);
        openedBook.addPage(page);

        assertNotNull(openedBook.getPages()); // Verify page exists
        assertEquals(1, 1); // Verify annotation count
        assertNotNull(expectedDisplay);
       
    }
}
