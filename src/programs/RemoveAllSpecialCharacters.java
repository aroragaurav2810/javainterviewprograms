package programs;

public class RemoveAllSpecialCharacters
{
    // Input: "a@b#c!" → "abc"
    static void main() {
        String str="a@b#c!";
        String new_str="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)<'a' || str.charAt(i)>'z')
            {

            }
            else
            {
                new_str=new_str+str.charAt(i);
            }
        }
        System.out.println(new_str);
    }
}
