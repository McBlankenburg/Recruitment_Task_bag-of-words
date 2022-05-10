package com.tomtom.lns.interview;

class BagOfWordsFactory {

    BagOfWords createBagOfWords(String document) {
        return new BagOfWords(document);
    }

}
