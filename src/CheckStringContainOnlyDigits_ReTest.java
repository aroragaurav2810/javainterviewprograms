public class CheckStringContainOnlyDigits_ReTest
{


    static void main() {
        String str="abc12!#@$%@456";
        boolean stringcontainsdigit=true;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)<'0' || str.charAt(i)>'9')
            {
                stringcontainsdigit=false;
                break;
            }
        }
        if(stringcontainsdigit)
        {
            System.out.println("string contains only digits");
        }
        else
        {
            System.out.println("string contains other than digits");
        }
    }


}
