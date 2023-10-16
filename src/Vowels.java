public class Vowels
{
    public static int getCount(String str)
    {
        String vowels = "aeiou";
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(vowels.contains(String.valueOf(str.charAt(i)).toLowerCase()))
            {
                count += 1;
            }
        }
        return count;
    }
}

//public class Vowels {
//
//    public static int getCount(String str) {
//        int vowelsCount = 0;
//
//        for(char c : str.toCharArray())
//            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
//
//        return vowelsCount;
//    }
//
//}