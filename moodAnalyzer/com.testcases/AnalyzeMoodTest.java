import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnalyzeMoodTest
{
    @Test
    public void givenSadInMessage_returnSad()
    {
        String message = "I am in sad mood";
        String expectedWord = "sad";
        String returned = MoodAnalyzer.analyzer(message);
        Assert.assertEquals(expectedWord,returned);
    }

    @Test
    public void givenHappyInMessage_returnHappy()
    {
        String message = "I am in any mood";
        String expectedWord = "happy";
        String returned = MoodAnalyzer.analyzer(message);
        Assert.assertEquals(expectedWord,returned);
    }

}

//