public class CheckStringContainOnlyDigits
{


    static void main() {
        String str="1234567";
        boolean is_digit=true;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)<'0' || str.charAt(i)>'9')
            {
                is_digit=false;
                break;
            }

        }
        if(is_digit)
        {
            System.out.println("String contains only digit");
        }
        else
        {
            System.out.println("String doesn't contain only digits");
        }
    }

}
