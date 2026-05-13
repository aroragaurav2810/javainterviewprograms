package programs_restested;

import java.util.Arrays;

public class SecondLargestNumberInAnArray_ReTest
{


    static void main()
    {

        int arr[]=new int[]{10,30,03,40,04,100,20};
        Arrays.sort(arr);
        System.out.println("Second largest number in an array is: "+arr[arr.length-2]);

    }


}
