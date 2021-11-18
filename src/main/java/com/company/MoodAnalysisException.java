package com.company;

public class MoodAnalysisException extends Exception {
    public Exception_Type type;
    public MoodAnalysisException(String message, Exception_Type type) {
        super(message);
    }

    public enum Exception_Type {
        NULL, EMPTY;
    }
}