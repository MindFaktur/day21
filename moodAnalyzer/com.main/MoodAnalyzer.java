public class MoodAnalyzer {

    public static void main(String[] args) {
        Analyzer azObj = new Analyzer("I am in no mood");

        if ( azObj.moodAnalyzer().equals("sad") )
        {
            System.out.println("Sad");
        }else
        {
            System.out.println("happy");
        }
    }

}


