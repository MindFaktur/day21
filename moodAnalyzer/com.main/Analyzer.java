
public class Analyzer
{
    private String message;

    public Analyzer(){}

    public Analyzer(String message)
    {
        super();
        this.message = message;
    }

    public String moodAnalyzer() throws NullPointerException
    {
        String sadWord = "sad";

        if( message == null )
        {
            throw new MoodAnalysisException("The String is null " + MoodAnalysisErrors.NULL);
        }
        if( message.equals("") )
        {
            throw new MoodAnalysisException("The String is empty " + MoodAnalysisErrors.EMPTY_STRING);
        }

        if( message.toLowerCase().contains(sadWord) )
        {
            return "sad";
        }else
        {
            return "happy";
        }

    }
}

