package com.example.loopboard.core;

import android.content.res.Resources;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class QuechuaLanguageHandler {
    private Map<String, String> quechuaDictionary;

    public QuechuaLanguageHandler(InputStream dictionaryStream) {
        this.quechuaDictionary = parseDictionary(dictionaryStream);
    }

    private Map<String, String> parseDictionary(InputStream stream) {
        Map<String, String> dictionary = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder jsonString = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonString.append(line);
            }
            JSONObject jsonObject = new JSONObject(new JSONTokener(jsonString.toString()));
            for (String key : jsonObject.keySet()) {
                dictionary.put(key, jsonObject.getString(key));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dictionary;
    }

    public String translateToQuechua(String input) {
        return quechuaDictionary.getOrDefault(input.toLowerCase(), input);
    }
}