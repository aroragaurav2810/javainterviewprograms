import java.util.HashMap;
import java.util.Map;

public class CompressString_ReTest

{


    static void main() {
        String str="aabbcccaa";
        String compressed_string="";
        Map<Character, Integer> char_value_map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(char_value_map.containsKey(str.charAt(i)))
            {
                char_value_map.put(str.charAt(i), char_value_map.get(str.charAt(i))+1);
            }
            else {
                char_value_map.put(str.charAt(i), 1);
            }

        }
        System.out.println(char_value_map);
        for(Character ch:char_value_map.keySet())
        {
            compressed_string=compressed_string+ch+char_value_map.get(ch);
        }
        System.out.println("Compressed string is: "+compressed_string);
    }

}
