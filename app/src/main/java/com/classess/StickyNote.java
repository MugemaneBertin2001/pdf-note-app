package com.classess;

public class StickyNote {
    private String text;
    private String color; // Simplified for demonstration
    private int positionX, positionY; // Simplified position representation
    private boolean closed;

    public StickyNote(String text, String color, int positionX, int positionY) {
        this.text = text;
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
        this.closed = false; // Initialize as not closed
    }

    // Getters and Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
