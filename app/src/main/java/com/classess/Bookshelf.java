package com.classess;
import java.util.HashMap;
import java.util.Map;

public class Bookshelf {
    private String name;
    private Map<Integer, Book> books;
    private DisplayMode displayMode;

    public Bookshelf(String name) {
        this.name = name;
        this.books = new HashMap<>();
        this.displayMode = DisplayMode.VISUAL; // Default display mode
    }

    // Imports a book into the bookshelf
    public void importBook(Book book) {
        if (book != null && !books.containsKey(book.getId())) {
            books.put(book.getId(), book);
            System.out.println("Book \"" + book.getTitle() + "\" added to the bookshelf.");
        }
    }

    // Deletes a book from the bookshelf
    public void deleteBook(int bookId) {
        if (books.containsKey(bookId)) {
            books.remove(bookId);
            System.out.println("Book with ID: " + bookId + " has been deleted from the bookshelf.");
        } else {
            System.out.println("Book with ID: " + bookId + " not found.");
        }
    }

    // Switches the display mode of the bookshelf
    public void switchDisplayMode(DisplayMode mode) {
        this.displayMode = mode;
        System.out.println("Display mode switched to: " + mode);
    }

    // Edits the information of a book in the bookshelf
    public void editBookInfo(int bookId, String newTitle, String newAuthor, String[] newTags) {
        if (books.containsKey(bookId)) {
            Book book = books.get(bookId);
            book.setTitle(newTitle);
            book.setAuthor(newAuthor);
            book.setTags(newTags);
            System.out.println("Book with ID: " + bookId + " has been updated.");
        } else {
            System.out.println("Book with ID: " + bookId + " not found.");
        }
    }

    // Opens and reads a book from the bookshelf
    public Book openBook(int bookId) {
        if (books.containsKey(bookId)) {
            System.out.println("Opening book with ID: " + bookId);
            return books.get(bookId);
        } else {
            System.out.println("Book with ID: " + bookId + " not found.");
            return null;
        }
    }

    // Displays the books in the bookshelf according to the current display mode
    public void displayBooks() {
        if (displayMode == DisplayMode.VISUAL) {
            System.out.println("Visual display of books:");
        } else {
            System.out.println("List display of books:");
        }
        books.values().forEach(System.out::println);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DisplayMode getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(DisplayMode displayMode) {
        this.displayMode = displayMode;
    }
}
