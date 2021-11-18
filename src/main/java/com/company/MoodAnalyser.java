package com.company;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {

            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            if (message == null)
                throw new MoodAnalysisException("Invalid Mood", MoodAnalysisException.Exception_Type.NULL);
            else
                throw new MoodAnalysisException("Invalid Mood", MoodAnalysisException.Exception_Type.EMPTY);
        }
    }
}