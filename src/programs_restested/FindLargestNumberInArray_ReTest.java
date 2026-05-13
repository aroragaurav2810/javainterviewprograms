package programs_restested;

import java.util.Arrays;
import java.util.Collections;

public class FindLargestNumberInArray_ReTest
{
    static void main() {
        Integer arr1[]=new Integer[]{20,10,50,100,40,70,30,50};
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
        System.out.println("Largest element in after reverse sort an array: "+arr1[0]);

        int arr2[]=new int[]{20,10,50,100,40,70,30,50};
        int largest_number=arr2[0];
        for(int i=1;i<arr2.length;i++)
        {
            if(arr2[i]>largest_number)
            {
                largest_number=arr2[i];
            }
        }
        System.out.println("Largest element is an array without sorting the array: "+largest_number);



    }

}
