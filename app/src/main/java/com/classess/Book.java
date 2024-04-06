package com.classess;
import java.util.ArrayList;
import java.util.List;
public class Book {

    private int id;
    private String title;
    private String author;
    private List<String> tags;
    private List<Page> pages;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.tags = new ArrayList<>();
        this.pages = new ArrayList<>();
    }

    // Add a page to the book
    public void addPage(Page page) {
        if (page != null) {
            pages.add(page);
        }
    }

    // Set tags from an array of strings
    public void setTags(String[] tags) {
        this.tags.clear();
        if (tags != null) {
            for (String tag : tags) {
                this.tags.add(tag);
            }
        }
    }

    // Method to get a formatted string representing the book's metadata
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tags=" + tags +
                ", pages=" + pages.size() +
                '}';
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTags() {
        return new ArrayList<>(tags);
    }

    public List<Page> getPages() {
        return new ArrayList<>(pages);
    }
}
