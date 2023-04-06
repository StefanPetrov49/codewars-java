import java.lang.reflect.Array;
import java.util.Arrays;

public class Kata {

    public int min(int[] list) {
        Arrays.sort(list);
        return (int) Array.get(list, 0);
    }

    public int max(int[] list) {
        Arrays.sort(list);
        return (int) Array.get(list, (list.length-1));
    }
}
