public class SmallestIntegerFinder
{
    public static int findSmallestInt(int[] args)
    {
        int lowestNumber = Integer.MAX_VALUE;
        for(int number : args)
        {
            if (number < lowestNumber)
            {
                lowestNumber = number;
            }
        }
        return lowestNumber;
    }
}
