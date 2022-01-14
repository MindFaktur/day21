
public class Analyzer
{
    private String message;

    public Analyzer(){}

    public Analyzer(String message){
        super();
        this.message = message;
    }

    public String moodAnalyzer() throws NullPointerException
    {
        String sadWord = "sad";
        try{
            if( message.toLowerCase().contains(sadWord) )
            {
                return "sad";
            }else
            {
                return "happy";
            }
        }catch (NullPointerException e)
        {
            return "happy";
        }

    }
}