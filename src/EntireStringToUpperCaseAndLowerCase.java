public class EntireStringToUpperCaseAndLowerCase

{

    static String convertToUpperCase(String str)
    {
        String upper_case_string="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                ch= (char) (ch-32);
            }
            upper_case_string=upper_case_string+ch;
        }

        return upper_case_string;

    }

    static String convertToLowerCase(String str)
    {
        String lower_case_string="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                ch= (char) (ch+32);
            }
            lower_case_string=lower_case_string+ch;
        }

        return lower_case_string;
    }

    // Convert the entire string to upper case or lower case without using the built in function.
    // Solution: Use ASCII login (ch-32) or (ch+32)

    public static void convertToDifferentCaseWithAnotherApproach()
    {
        String str="Sometimes We need to pull back to Launch Further";
        String upper_case_string="";
        String lower_case_string="";
        for(int i=0;i<str.length();i++)
        {
            upper_case_string=(upper_case_string+str.charAt(i)).toUpperCase();
            lower_case_string=(lower_case_string+str.charAt(i)).toLowerCase();
        }
        System.out.println("Upper case string of '"+str+"' is: "+upper_case_string);
        System.out.println("Lower case string of '"+str+"' is: "+lower_case_string);
    }

    public static void main()
    {
        String lower_case_str="pulling back to come stronger";
        String upper_case_str="PULLING BACK TO COME STRONGER";
        System.out.println("Lower case string '"+lower_case_str+"' converted to upper case: "+convertToUpperCase(lower_case_str));
        System.out.println("Upper case string '"+upper_case_str+"' converted to lower case: "+convertToLowerCase(upper_case_str));
        convertToDifferentCaseWithAnotherApproach();


    }

}
