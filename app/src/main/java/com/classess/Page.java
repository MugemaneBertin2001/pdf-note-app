package com.classess;

import java.util.ArrayList;
import java.util.List;

public class Page {
    private int pageNumber;
    private List<Annotation> annotations;
    private List<StickyNote> stickyNotes;
    private boolean isBookmarked;

    public Page(int pageNumber) {
        this.pageNumber = pageNumber;
        this.annotations = new ArrayList<>();
        this.stickyNotes = new ArrayList<>();
        this.isBookmarked = false;
    }

    public void addAnnotation(Annotation annotation) {
        annotations.add(annotation);
    }

    // Add a StickyNote to the page
    public void addStickyNote(StickyNote stickyNote) {
        stickyNotes.add(stickyNote);
    }

    // Setters and Getters
    public int getPageNumber() {
        return pageNumber;
    }

    public List<Annotation> getAnnotations() {
        return annotations;
    }

    public List<StickyNote> getStickyNotes() {
        return stickyNotes;
    }

    public boolean isBookmarked() {
        return isBookmarked;
    }

    public void setBookmarked(boolean bookmarked) {
        isBookmarked = bookmarked;
    }
}
