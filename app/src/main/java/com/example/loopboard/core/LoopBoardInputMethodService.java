package com.example.loopboard.core;

import android.inputmethodservice.InputMethodService;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.example.loopboard.models.KeyboardLayout;
import com.example.loopboard.utils.ADHSLoopOptimizer;

public class LoopBoardInputMethodService extends InputMethodService {
    private KeyboardLayoutManager layoutManager;
    private ADHSLoopOptimizer loopOptimizer;
    private QuechuaLanguageHandler quechuaHandler;

    @Override
    public void onCreate() {
        super.onCreate();
        this.layoutManager = new KeyboardLayoutManager();
        this.loopOptimizer = new ADHSLoopOptimizer();
        this.quechuaHandler = new QuechuaLanguageHandler(getResources().openRawResource(R.raw.quechua_dictionary));
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        loopOptimizer.trackKeyPress();
        InputConnection ic = getCurrentInputConnection();
        if (ic != null) {
            ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, keyCode));
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onFinishInput() {
        loopOptimizer.reset();
        super.onFinishInput();
    }
}