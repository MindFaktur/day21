public class MoodAnalyzer {

    public static void main(String[] args) {
        Analyzer azObj = new Analyzer("");
        try {
            if ( azObj.moodAnalyzer().equals("sad") )
            {
                System.out.println("Sad");
            }else
            {
                System.out.println("happy");
            }
        }catch (MoodAnalysisException e)
        {
            System.out.println(e);
        }

    }

}


//