public class EntireStringToUpperCaseAndLowerCase_ReTest {


    static void main() {
        String str="Sometimes We need to pull back to Launch Further";
        String upper_case_string="";
        String lower_case_string="";
        for(int i=0;i<str.length();i++)
        {
            upper_case_string=(upper_case_string+str.charAt(i)).toUpperCase();
            lower_case_string=(lower_case_string+str.charAt(i)).toLowerCase();
        }
        System.out.println(upper_case_string);
        System.out.println(lower_case_string);


    }


}
