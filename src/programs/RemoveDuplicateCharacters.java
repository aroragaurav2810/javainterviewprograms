package programs;

public class RemoveDuplicateCharacters
{


    static void main() {

        String str_with_spaces="sometimes you need to pullback";
        String str=str_with_spaces.replace(" ","");
        System.out.println("original string is: "+str);
        String result_str="";

        for(int i=0;i<str.length();i++)
        {
            if(result_str.contains(str.charAt(i)+""))
            {

            }
            else
            {
                result_str=result_str+str.charAt(i);
            }

        }
        System.out.println("String after removing duplicate characters is: "+result_str);
    }


}
