import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters
{
     static void main() {
        String str="abcabcbb";
        Set<String> substring_set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++) {
            String sub_string = "";
            for (int j = i + 1; j <= str.length(); j++) {

                sub_string = str.substring(i, j);
                substring_set.add(sub_string);
                if (j < str.length() && sub_string.contains(str.charAt(j) + "")) {
                    break;
                }
            }
        }
            System.out.println("Substring set is "+substring_set);
            int longest_substring_length=0;
            List<String> longest_sub_string_list=new ArrayList<>();
            for(String substring:substring_set)
            {
                if(substring.length()>=longest_substring_length)
                {
                    longest_substring_length=substring.length();
                    longest_sub_string_list.add(substring);
                }
            }
            System.out.println("Longest substring are "+longest_sub_string_list+" and longest length without repeating character is: "+longest_substring_length);


    }


}
