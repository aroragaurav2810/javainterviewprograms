package programs;

public class PallindromeString

{

    static boolean checkPallindromeString(String str)
    {
        boolean is_pallindrome=false;
        String str_rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str_rev=str_rev+str.charAt(i);
        }
        if(str.equalsIgnoreCase(str_rev))
        {
            is_pallindrome=true;
        }
        return is_pallindrome;
    }


    static void main() {
        String str="AroRa";
        boolean is_pallindrome;
        is_pallindrome=checkPallindromeString(str);
        System.out.println("String is pallindrome ? "+is_pallindrome);
    }

}


