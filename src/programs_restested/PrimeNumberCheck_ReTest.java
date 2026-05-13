package programs_restested;

import java.util.Scanner;

public class PrimeNumberCheck_ReTest
{

    static void main() {
        System.out.println("Please enter a number to check if this is prime or not");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        boolean is_prime=true;
        if(number<=1)
        {
            System.out.println("please enter a positive number or number greater than one");
            System.exit(0);
        }
        else
        {
            System.out.println("Number entered by user is "+number);
        }
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                is_prime=false;
                break;
            }
        }
        if(is_prime)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }


    }

}
