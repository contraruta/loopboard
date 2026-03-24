package com.example.loopboard.core;

import android.view.inputmethod.InputConnection;
import com.example.loopboard.models.KeyboardLayout;

public class KeyboardLayoutManager {
    private KeyboardLayout currentLayout;

    public void switchLayout(KeyboardLayout layout) {
        this.currentLayout = layout;
    }

    public void sendKeyPress(InputConnection inputConnection, int keyCode) {
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new android.view.KeyEvent(android.view.KeyEvent.ACTION_DOWN, keyCode));
        }
    }
}