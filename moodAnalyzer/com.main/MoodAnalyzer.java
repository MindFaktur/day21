public class MoodAnalyzer {

    public static void main(String[] args) {
        analyzer("I is not in any mood");
    }

    public static void analyzer(String message)
    {
        String sadWord = "sad";
        if( message.toLowerCase().contains(sadWord) )
        {
            System.out.println("I am Sad");
        }else
        {
            System.out.println("I am Happy");
        }
    }

}
