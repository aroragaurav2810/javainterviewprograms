public class FactorialOfANumber
{

    static void main() {
        int number=5;
        int factorial=1;
        for(int i=number;i>0;i--)
        {
            factorial=factorial*i;
        }

        System.out.println("Factorial of a number is "+factorial);
    }

}
