package programs_restested;

public class RemoveDuplicateCharacters_ReTest
{


    static void main() {
        String str_with_spaces="sometimes you need to pullback to launch further";
        String str=str_with_spaces.replace(" ", "");
        String new_str="";
        for(int i=0;i<str.length();i++)
        {
            if(new_str.contains(str.charAt(i)+""))
            {
                // Do Nothing
            }
            else
            {
                new_str=new_str+str.charAt(i);
            }
        }
        System.out.println("Removed duplicate characters: "+new_str);


    }

}
