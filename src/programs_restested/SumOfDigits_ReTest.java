package programs_restested;

public class SumOfDigits_ReTest
{


    static void main() {

        int number=654;
        int sum_of_digits=0;
        String str=String.valueOf(number);
        for(int i=0;i<str.length();i++)
        {
            sum_of_digits=sum_of_digits+Integer.parseInt(str.charAt(i)+"");;
        }
        System.out.println("Sum of digits of a given number is: "+sum_of_digits);
    }

}
