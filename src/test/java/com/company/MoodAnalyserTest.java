package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMoodSad_ShouldReturnSAD() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("Sad");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenAnyMood_ShouldReturnHAPPY() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}