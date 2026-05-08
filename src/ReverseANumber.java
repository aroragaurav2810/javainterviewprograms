public class ReverseANumber
{

    static void main() {
        int number=678;
        int quotient=0;
        int remainder=0;
        int reverse_number=0;
        System.out.print("Reverse of "+number+" is: ");
        do
        {
            quotient=number/10;
            remainder=number%10;
            reverse_number=reverse_number*10+remainder;
            number=quotient;
        }while(quotient>0);
        System.out.print(reverse_number);
    }

}
