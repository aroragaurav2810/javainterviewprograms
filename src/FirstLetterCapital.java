import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetterCapital

{

    public static void main(String args[]) {

        String str="my life is long enough";
        String words[]=str.split(" ");
        System.out.println(Arrays.toString(words));
        String new_string="";

        for(String word:words)
        {
            new_string=new_string+Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";

        }
        System.out.println(new_string);
        //System.out.println(string_list);






    }


}
