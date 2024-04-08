package com.classess;

public abstract class Annotation {
    protected String content;
    protected String color; // Simplified to String for demonstration

    // Constructor and common methods
    public Annotation(String content, String color) {
        this.content = content;
        this.color = color;
    }

    // Abstract methods for subclasses to implement
    public abstract void modify(String newContent);

    // Getters and Setters
    public String getContent() {
        return content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Object getText();

    public abstract Integer getX();
}
