package programs_restested;

public class ToggleCase_ReTest
{

    static void main() {
        String str="aBc&^";
        String new_str="";
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)>='A' && str.charAt(i)<='Z')
           {
               char ch= (char) (str.charAt(i)+32);
               new_str=new_str+ch;
               // or new_str=new_str+(str.charAt(i)+"").toLowerCase();
           }
           else if(str.charAt(i)>='a' && str.charAt(i)<='z')
           {
               char ch= (char) (str.charAt(i)-32);
               new_str=new_str+ch;
               // or new_str=new_str+(str.charAt(i)+"").toUpperCase();
           }
           else
           {
               new_str=new_str+str.charAt(i);
           }
        }
        System.out.println(new_str);
    }


}
