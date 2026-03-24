package com.example.loopboard.models;

public class KeyboardLayout {
    private int layoutId;
    private String language;

    public KeyboardLayout(int layoutId, String language) {
        this.layoutId = layoutId;
        this.language = language;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public String getLanguage() {
        return language;
    }
}