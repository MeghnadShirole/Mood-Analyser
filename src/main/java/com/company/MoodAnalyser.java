package com.company;

public class MoodAnalyser {

    public MoodAnalyser() {

    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}