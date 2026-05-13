package programs;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries
{

    // Fibnonacci Series: 1, 2, 3, 5, 8 ............

    static void main() {
        int a=0;
        int b=1;
        int n=10;
        List<Integer> fibonacci_series=new ArrayList<>();
        fibonacci_series.add(a);
        fibonacci_series.add(b);
        for(int i=2;i<n;i++)
        {
            int temp=a+b;
            a=b;
            b=temp;
            fibonacci_series.add(temp);
        }
        System.out.println(fibonacci_series);
    }

}
