package com.tomtom.lns.interview;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BagOfWordsTest {

    private BagOfWordsFactory bagOfWordsFactory = new BagOfWordsFactory();

    @Test
    void createsBagOfWordFromSimpleDocument() {
        // given
        String document = "Real time analytics approach.";

        // when
        BagOfWords bagOfWords = bagOfWordsFactory.createBagOfWords(document);

        // then
        assertThat(bagOfWords.size()).isEqualTo(4);
    }

    @Test
    void createsBagOfWordFromNonUniqueTokens() {
        // given
        String document = "Streaming architecture on top of Apache Flink and apache Kafka. Real time analytics " +
                "approach.";

        // when
        BagOfWords bagOfWords = bagOfWordsFactory.createBagOfWords(document);

        // then
        assertThat(bagOfWords.size()).isEqualTo(13);
    }

    @Test
    void createsBagOfWordWithProperTokenFrequency() {
        // given
        String document = "Streaming architecture on top of Apache Flink and apache Kafka. Real time analytics " +
                "approach.";

        // when
        BagOfWords bagOfWords = bagOfWordsFactory.createBagOfWords(document);
        // then
        assertThat(bagOfWords.tokenFrequency("Apache")).isEqualTo(2);
    }

}