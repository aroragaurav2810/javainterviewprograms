package programs;

public class SumOfDigits {

    static void main() {
        int number = 6787;
        int sum=0;
        int quotient=0;
        int remainder=0;
        do
        {
            quotient=number/10;
            remainder=number%10;
            sum=sum+remainder;
            number=quotient;
        }while(quotient>0);
        System.out.println("Sum of digits is "+sum);
    }
}