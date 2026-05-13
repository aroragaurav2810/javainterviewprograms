package programs_restested;

public class SwapTwoNumbersWithoutTempVariable_ReTest
{

    static void main() {
        int a=10;
        int b=20;
        System.out.println("Before swap, value of a is "+a);
        System.out.println("Before swap, value of b is "+b);
        int temp=a+b;
        b=a;
        a=temp-b;

        System.out.println("After swap, value of a is "+a);
        System.out.println("After swap value of b is "+b);
    }


}
