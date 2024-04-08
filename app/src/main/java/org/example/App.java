package org.example;

import com.classess.Book;
import com.classess.Bookshelf;
import com.classess.DisplayMode;
import com.classess.Page;
import com.classess.StickyNote;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting PDF-Notes Application...");
        Bookshelf bookshelf = new Bookshelf("Bookshelf");
        bookshelf.importBook(new Book(1, "Effective Java", "Joshua Bloch"));
        bookshelf.switchDisplayMode(DisplayMode.LIST);
        bookshelf.displayBooks();

        Book book = bookshelf.openBook(1);
        if (book != null) {
            Page page = new Page(1);
            StickyNote stickyNote = new StickyNote("Sample Text", "Yellow", 100, 100);
            page.addStickyNote(stickyNote);
            book.addPage(page);

            System.out.println("Navigating to page " + page.getPageNumber() + " with annotations."+ page.getAnnotations()+"");
        } else {
            System.out.println("Book not found.");
        }
    }
}
