package com.example.thedictionary;

public class Word
    {
     String germanWord;
     String englishWord;



    public Word(String germanWord, String englishWord ){
        this.germanWord = germanWord;
        this.englishWord = englishWord;
    }

        @Override
        public String toString() {
            return "Word{" +
                    "germanWord='" + germanWord + '\'' +
                    ", englishWord='" + englishWord + '\'' +
                    '}';
        }
    }
