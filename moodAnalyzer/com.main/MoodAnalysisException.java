public class MoodAnalysisException extends RuntimeException{

    private String message;
    private MoodAnalysisErrors type;

    public MoodAnalysisException()
    {
        super();
    };

    public MoodAnalysisException(String message){
        super(message);
    }

}
