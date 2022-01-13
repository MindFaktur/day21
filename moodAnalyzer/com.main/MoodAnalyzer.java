public class MoodAnalyzer {

    public static void main(String[] args) {
        if ( (analyzer("I is not in any mood")).equals("sad") )
        {
            System.out.println("Sad");
        }else
        {
            System.out.println("happy");
        }
    }

    public static String analyzer(String message)
    {
        String sadWord = "sad";
        if( message.toLowerCase().contains(sadWord) )
        {
            return "sad";
        }else
        {
            return "happy";
        }
    }

}
