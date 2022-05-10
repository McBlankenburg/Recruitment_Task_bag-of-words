package com.tomtom.lns.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

class BagOfWords {

    private String document;
    private HashMap hashMap = new HashMap<String, Integer>();

    public BagOfWords(String document) {
        this.document = document;
    }

    long size() {
        String [] words = document.split(" ");
         for (String word : words){
            String key = word.toLowerCase();

             if(hashMap.containsKey(key)){
                 int value = 1 + (int) hashMap.get(key);
                 hashMap.put(key, value);
             }else{
                 hashMap.put(key, 1);
             }
         }
        return hashMap.size();
    }

    long tokenFrequency(String token) {
        size();
        String key = token.toLowerCase();
        int valueOfKey = 0;
        if(hashMap.containsKey(key)){
           valueOfKey = (int) hashMap.get(key);
        }
        return valueOfKey;
    }
}
