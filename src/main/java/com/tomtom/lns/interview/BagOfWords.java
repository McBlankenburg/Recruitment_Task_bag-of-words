package com.tomtom.lns.interview;

import java.util.HashMap;

class BagOfWords {

    final private HashMap hashMap = new HashMap<String, Long>();

    public BagOfWords(String document) {
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
    }

    long size() {
        return hashMap.size();
    }

    long tokenFrequency(String token) {
        String key = token.toLowerCase();
        return Long.parseLong(hashMap.get(key).toString());
    }
}
