public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    public static String getShortestWord(String str1, String str2)
    {
        int length_str1 = str1.length();
        int length_str2 = str2.length();

        if (length_str1 < length_str2)
        {
            return str1;
        } else if (length_str1 == length_str2) {
            return str1;
        } else
        {
            return str2;
        }

    }
}
