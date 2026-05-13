package programs;

public class ReplaceAllDigitsWithHash
{
    // Input: "a1b2c3" → "a#b#c#"
    static void main() {
    String str="a1b2c3";
    String new_str="";
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
        {
            new_str=new_str+str.charAt(i);
        }
        else
        {
            new_str=new_str+"#";
        }
    }
        System.out.println(new_str);


    }

}
