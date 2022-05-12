package com.tomtom.lns.interview;

import java.util.HashMap;

class BagOfWords {

    final private HashMap<String, Long> hashMap = new HashMap<>();

    public BagOfWords(String document) {
        String [] words = document.toLowerCase().split(" ");
        for (String key : words){
            if(hashMap.containsKey(key)){
                hashMap.put(key, hashMap.get(key)+1L);
            } else{
                hashMap.put(key, 1L);
            }
        }
    }

    long size() {
        return hashMap.size();
    }

    long tokenFrequency(String token) {
        String key = token.toLowerCase();
        if (hashMap.containsKey(key)){
            return hashMap.get(key);
        }
       return 0;
    }
}
