package programs;

public class RemoveDuplicatesFromString
{


    static void main() {
        String str_with_space="sometimes you need to pullback to launch further";
        String str=str_with_space.replace(" ", "");
        String new_str="";
        for(int i=0;i<str.length();i++)
        {
            if(!new_str.contains(str.charAt(i)+""))
            {
                new_str=new_str+str.charAt(i);
            }

        }
        System.out.println(new_str);

    }

}
