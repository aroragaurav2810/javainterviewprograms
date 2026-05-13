package programs;

import java.util.HashMap;
import java.util.Map;

public class CompressString
{

    // Input: "aaabbc" → "a3b2c1"
    static void main()
    {

        String str="aaabbc";
        Map<Character, Integer> character_map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(character_map.containsKey(str.charAt(i)))
            {
                character_map.put(str.charAt(i),character_map.get(str.charAt(i))+1);
            }
            else
            {
                character_map.put(str.charAt(i),1);
            }
        }
        String compressed_string="";
        for(char key:character_map.keySet())
        {
            compressed_string=compressed_string+key+character_map.get(key);
        }
        System.out.println(compressed_string);
    }


}
