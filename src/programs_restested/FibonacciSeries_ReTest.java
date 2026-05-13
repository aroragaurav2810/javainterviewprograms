package programs_restested;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries_ReTest
{


    static void main() {
        int show_fibonacci_series_until_given_number=10;
        int first_fixed_number=0;
        int second_fixed_number=1;
        List<Integer> fibonacci_list=new ArrayList<>();
        fibonacci_list.add(first_fixed_number);
        fibonacci_list.add(second_fixed_number);
        for(int i=2;i<show_fibonacci_series_until_given_number;i++)
        {
            int temp=first_fixed_number+second_fixed_number;
            first_fixed_number=second_fixed_number;
            second_fixed_number=temp;
            fibonacci_list.add(temp);
        }

        System.out.println("Fibonacci series is: "+fibonacci_list);


    }

}
