package programs_restested;

public class RemoveAllSpecialCharacters_ReTest
{

    static void main() {

        String str="@gau!ra3v#ar12ora$%";
        String new_str_without_special_char="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z'
                    || str.charAt(i)>='A' && str.charAt(i)<='A'
                    || str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                new_str_without_special_char=new_str_without_special_char+str.charAt(i);
            }
        }
        System.out.println("String after removal of special character: "+new_str_without_special_char);

    }

}
