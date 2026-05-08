public class ToggleCase
{

    // "AbC" → "aBc"

    static void main() {
        String str="AbC";
        String toggled_string="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                char ch= (char) (str.charAt(i)-32);
                toggled_string=toggled_string+ch;
            }
            else
            {
                char ch= (char) (str.charAt(i)+32);
                toggled_string=toggled_string+ch;
            }
        }
        System.out.println(toggled_string);
    }

}
