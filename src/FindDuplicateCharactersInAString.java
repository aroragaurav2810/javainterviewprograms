import java.util.*;

public class FindDuplicateCharactersInAString
{


    public static void main() {

        String str="sometimes you need to be pulled back to launch further";
        String str_without_spaces=str.replace(" ","");
        System.out.println(str_without_spaces);
        String str_incremental=str_without_spaces.charAt(0)+"";
        Set<Character> duplicate_characters_list=new HashSet<>();
        for(int i=1;i<str_without_spaces.length();i++)
        {
            if(str_incremental.contains(str_without_spaces.charAt(i)+""))
            {
                duplicate_characters_list.add(str_without_spaces.charAt(i));
            }
            str_incremental=str_incremental+str_without_spaces.charAt(i);
        }
        System.out.println(duplicate_characters_list);

    }

}
