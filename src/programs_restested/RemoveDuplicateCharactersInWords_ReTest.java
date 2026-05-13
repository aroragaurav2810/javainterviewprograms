package programs_restested;

public class RemoveDuplicateCharactersInWords_ReTest
{


    static void main() {
        String str= "Sometimes you need to pullback to launch further";
        String arr[]=str.split(" ");
        String new_str="";
        for(String temp_str:arr)
        {
            String new_temp_str="";
            for(int i=0;i<temp_str.length();i++)
            {
                if(new_temp_str.contains(temp_str.charAt(i)+""))
                {
                    // Do nothing
                }
                else
                {
                    new_temp_str=new_temp_str+temp_str.charAt(i);
                }
            }
            new_str=new_str+new_temp_str+" ";
        }
        System.out.println(new_str);

    }


}
