package programs_restested;

public class ReplaceAllDigitsWithHash_ReTest
{

    static void main() {
        String str="gaurav123arora456";
        String new_str="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                new_str=new_str+'#';
            }
            else
            {
                new_str=new_str+str.charAt(i);
            }
        }
        System.out.println(new_str);
    }


}
