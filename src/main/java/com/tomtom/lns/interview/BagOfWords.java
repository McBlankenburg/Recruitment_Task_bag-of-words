package com.tomtom.lns.interview;

import java.util.HashMap;

class BagOfWords {

    final private HashMap<String, Long> hashMap = new HashMap<>();

    public BagOfWords(String document) {
        String [] words = document.split(" ");
        for (String word : words){
            String key = word.toLowerCase();

            if(hashMap.containsKey(key)){
                hashMap.put(key, hashMap.get(key)+1);
            } else{
                hashMap.put(key, 1L);
            }
        }
    }

    long size() {
        return hashMap.size();
    }

    long tokenFrequency(String token) {
        if (token != null){
            return hashMap.get(token.toLowerCase());
        }
       return 0;
    }
}
