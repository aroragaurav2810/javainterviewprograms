package programs_restested;

import java.util.Arrays;

public class MissingNumberInArray_ReTest
{

    static void main() {
        int ar[]=new int[]{10,70,20,40,30,50,90,60,100};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int diff=ar[1]-ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]-ar[i-1]!=diff)
            {
                System.out.println("Missing element is "+(ar[i]-diff));
                break;
            }
        }
    }


}
