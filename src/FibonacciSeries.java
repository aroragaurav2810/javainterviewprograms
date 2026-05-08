import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries
{

    // Fibnonacci Series: 1, 2, 3, 5, 8 ............

    static void main() {
        int a=1;
        int b=2;
        int n=10;
        List<Integer> fibonacci_series=new ArrayList<>();
        fibonacci_series.add(a);
        fibonacci_series.add(b);
        for(int i=2;i<n;i++)
        {
            int temp=a+b; // 1+2 = 3  , 2+3 =5
            a=b;   // 2 , 3,
            b=temp; // 3 , 5
            fibonacci_series.add(temp);
        }
        System.out.println(fibonacci_series);
    }

}
