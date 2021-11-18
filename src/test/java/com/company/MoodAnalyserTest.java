package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMoodSad_ShouldReturnSAD() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am In a Sad Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenAnyMood_ShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullMood_ShouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.Exception_Type.NULL,e.type);
        }
    }
}