package programs_restested;

public class PallindromeString_ReTest
{


    static void main() {
        String str="arora";
        System.out.println("Original string is: "+str);
        String reverse_string="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse_string=reverse_string+str.charAt(i);
        }
        System.out.println("Reverse string is: "+reverse_string);
        if(str.equals(reverse_string))
        {
            System.out.println("String is pallindrome");
        }
        else
        {
            System.out.println("String is not pallindrome");
        }
    }

}
