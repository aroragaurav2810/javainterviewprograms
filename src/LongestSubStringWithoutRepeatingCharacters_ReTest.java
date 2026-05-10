import java.sql.Array;
import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters_ReTest
{
     static void main() {
        String str="abcabcbb";
        Set<String> substring_set=new HashSet<>();

        for(int i=0;i<str.length();i++)
        {
            String substring=str.charAt(i)+"";
            for(int j=i+1;j<str.length();j++)
            {
                if(substring.contains(str.charAt(j)+""))
                {
                    break;
                }
                else
                {

                    substring=substring+str.substring(i, j);
                    substring_set.add(substring);

                }
            }


        }
         System.out.println(substring_set);
        int longest_length=0;
        for(String key:substring_set)
        {
            if(key.length()>longest_length)
            {
                longest_length=key.length();

            }
        }
         System.out.println(longest_length);


    }


}
