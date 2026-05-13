package programs;

public class PrimeNumberCheck
{

    static void main() {
        int number=9;
        boolean isPrime=true;
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }

}
