import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnalyzeMoodTest
{
    @Test
    public void givenSadInMessage_returnSad()
    {
        String message = "I am in sad mood";
        String returned = MoodAnalyzer.analyzer(message);
        Assert.assertEquals("sad",returned);
    }

}
