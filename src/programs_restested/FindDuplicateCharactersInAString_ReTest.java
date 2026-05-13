package programs_restested;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharactersInAString_ReTest
{

    static void main() {
        String str="gauravarora";
        String new_str="";
        Set<Character> duplicate_characters_list=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            if(new_str.contains(str.charAt(i)+""))
            {
                System.out.println("Duplicate element found: "+str.charAt(i));
                duplicate_characters_list.add(str.charAt(i));
            }
            else
            {
                new_str=new_str+str.charAt(i);
            }
        }
        System.out.println(duplicate_characters_list);
    }


}
