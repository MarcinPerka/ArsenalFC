package com.archu.arsenalfc.model;

public class Tile {
    private String textView;
    private int imageView;

    public Tile(String textView, int imageView) {
        this.textView = textView;
        this.imageView = imageView;
    }

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }

    public int getImageView() {
        return imageView;
    }
}