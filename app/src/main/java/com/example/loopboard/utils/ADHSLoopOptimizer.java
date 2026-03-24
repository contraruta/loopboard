package com.example.loopboard.utils;

import java.util.HashMap;
import java.util.Map;

public class ADHSLoopOptimizer {
    private Map<String, Integer> keyPressHistory;
    private int loopThreshold;

    public ADHSLoopOptimizer() {
        this.keyPressHistory = new HashMap<>();
        this.loopThreshold = 3;
    }

    public void trackKeyPress() {
        String currentInput = "";
        keyPressHistory.put(currentInput, keyPressHistory.getOrDefault(currentInput, 0) + 1);
    }

    public boolean detectLoop(String currentInput) {
        int count = keyPressHistory.getOrDefault(currentInput, 0);
        return count >= loopThreshold;
    }

    public void reset() {
        keyPressHistory.clear();
    }
}