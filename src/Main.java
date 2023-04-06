import java.lang.reflect.Array;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] test = new int[]{12, 0, 2, 1};
        Arrays.sort(test);
        System.out.println((int) Array.get(test, 0));

    }
}