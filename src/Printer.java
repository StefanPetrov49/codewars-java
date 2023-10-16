public class Printer
{
    public static String printerError(String str)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char currentChar = str.charAt(i); // This gives the character 'a'
            int ascii = (int) currentChar;
            if(97 <= ascii && ascii <= 109)
            {
                continue;
            }
            else {
               count++;
            }
        }
        String result = "" +count+"/"+str.length();
        return result;
    }
}

//public class Printer {
//
//    public static String printerError(String s) {
//        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
//    }
//}
//
//public class Printer {
//
//    public static String printerError(String s) {
//        return s.chars().filter(c -> c > 'm').count() + "/" + s.length();
//    }
//
//}