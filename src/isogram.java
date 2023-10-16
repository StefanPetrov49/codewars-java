
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class isogram {
    public static boolean  isIsogram(String str) {
        List<String> allLetters = new ArrayList<>();
        for(int i =0 ; i < str.length(); i++ )
        {
            if(i != 0)
            {
                String currentChar = String.valueOf(str.charAt(i));
                if(allLetters.contains(currentChar.toLowerCase()))
                {
                    return false;
                } else {
                    allLetters.add(String.valueOf(str.charAt(i)));
                }
            } else {
                allLetters.add(String.valueOf(str.charAt(i)).toLowerCase());
            }
        }
        return true;
    }
}

//public class isogram {
//    public static boolean  isIsogram(String str) {
//        return str.length() == str.toLowerCase().chars().distinct().count();
//    }
//}