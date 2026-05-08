public class ReverseAString

{

    static String reverseAString(String str)
    {
        String str_rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str_rev=str_rev+str.charAt(i);
        }
        return str_rev;
    }


    static void main() {
        String str="Hello";
        String reverse_str=reverseAString(str);
        System.out.println("Reverse of original string is "+reverse_str);

    }

}
