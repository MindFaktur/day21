import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnalyzeMoodTest
{
    @Test
    public void givenSadInMessage_returnSad()
    {
        Analyzer newMood = new Analyzer("I am in sad mood");
        String expectedWord = "sad";
        Assert.assertEquals(expectedWord,newMood.moodAnalyzer());
    }

    @Test
    public void givenHappyInMessage_returnHappy()
    {
        Analyzer newMood = new Analyzer("I am in happy mood");
        String expectedWord = "happy";
        Assert.assertEquals(expectedWord,newMood.moodAnalyzer());
    }

    @Test(expected = MoodAnalysisException.class)
    public void givenNull_throwsException() throws MoodAnalysisException
    {
        Analyzer newMood = new Analyzer();
        newMood.moodAnalyzer();
    }

    @Test(expected = MoodAnalysisException.class)
    public void givenEmptyString_throwsException() throws MoodAnalysisException
    {
        Analyzer newMood = new Analyzer("");
        newMood.moodAnalyzer();
    }

}

