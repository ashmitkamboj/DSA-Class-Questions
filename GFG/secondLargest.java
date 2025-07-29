public class secondLargest 
{
    public float getSecondLargest(int[] arr) 
    {
        int n = arr.length;
        float first = Float.NEGATIVE_INFINITY;
        float second = Float.POSITIVE_INFINITY;
        if (n < 2)
        {
            return -1;
        } 
        for(float num : arr)
        {
            if(num > first)
            {
                second = first;
                first = num;
            } else if (num > second && num != first)
            {
                second = num;
            }
        }
        if (second == Float.POSITIVE_INFINITY)
        {
            return -1;
        } else 
        {
            return second;
        }
    }
}