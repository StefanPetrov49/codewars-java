public class Solution
{
    public static String repeatStr(final int repeat, final String string) {
        String result = new String();
        for (int i = 0; i < repeat; i++)
        {
           result = result + string;
        }
        return result;
    }
}
