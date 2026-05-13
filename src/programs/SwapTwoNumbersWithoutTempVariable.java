package programs;

public class SwapTwoNumbersWithoutTempVariable
{


    static void main() {
        int a=50;
        int b=60;
        System.out.println("Original value of variable 'a' is: "+a);
        System.out.println("Original value of variable 'b' is: "+b);
        int temp=a;
        a=a+b; // 30
        b=a-b; // 30-20 = 10
        a=a-b;     // 30-10 = 20
        System.out.println("Swapped value of variable 'a' is: "+a);
        System.out.println("Swapped value of variable 'b' is: "+b);
    }


}
