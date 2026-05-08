import java.util.Arrays;

public class MissingNumberInArray
{

    static void main() {
        int arr[]=new int[]{50,10,20,40,60,100,70,80,90};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int difference=arr[1]-arr[0];
        System.out.println(difference);
        for(int i=1;i<=arr.length-1;i++)
        {
            if((arr[i]-arr[i-1])!=difference)
            {
                System.out.println("missing number is "+(arr[i-1]+10));
            }

        }
    }

}
