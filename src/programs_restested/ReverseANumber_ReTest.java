package programs_restested;

public class ReverseANumber_ReTest
{


    static void main() {
        int number =654;
        // int reverse_number=456;
        int sum=0;
        do
        {
            int remainder=number%10;
            int quotient=number/10;
            sum=sum*10+remainder;
            number=quotient;

        }while(number>0);
        System.out.println(sum);
    }

}
