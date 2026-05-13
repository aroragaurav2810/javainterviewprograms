package programs;

import java.util.Arrays;
import java.util.Collections;

public class FindLargestNumberInArray
{

    static void main() {
        int arr[]=new int[]{20,10,50,100,40,70,30,50};
        System.out.println("One way to move int array to Integer array");
        Integer arr_new[]=new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_new[i] = arr[i];
        }
        Arrays.sort(arr_new, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr_new));
        System.out.println("----------------------------------------------");
        System.out.println("Another way to move int array to Integer array");
        Integer arr_new_again[]= Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr_new_again, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr_new_again));
        System.out.println("----------------------------------------------");
        System.out.println("One way of finding Largest Number in an array is: "+arr_new_again[0]);
        System.out.println("----------------------------------------------");
        int largest_number=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest_number)
            {
                largest_number=arr[i];
            }
        }
        System.out.println("Another way of finding Largest Number in an array is: "+largest_number);
    }

}
