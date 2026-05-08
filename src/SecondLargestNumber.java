import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNumber {

    static void main(String[] args) {

        int arr[]=new int[]{50,10,60,70,20};
        Arrays.sort(arr);
        System.out.println("Second largest number is: "+arr[arr.length-2]);

}
}


/*
int largest_number=arr[i];
            for(int j=i+1;j<=arr.length-1;j++)
            {
                int temp_largest=arr[j];
                if(arr[j+1]>temp_largest)
                {
                    temp_largest=arr[j+1];
                    arr[j+1]=arr[j];
                }
            }
            sorted_array[i]=largest_number;
 */
