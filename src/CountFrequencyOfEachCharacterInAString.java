import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachCharacterInAString
{


    static void main() {
        String str_with_spaces="sometimes you need to pull back to launch further";
        String str=str_with_spaces.replace(" ","");
        Map<Character, Integer> map_character_value=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(map_character_value.containsKey(str.charAt(i)))
            {
                map_character_value.put(str.charAt(i), map_character_value.get(str.charAt(i))+1);
            }
            else
            {
                map_character_value.put(str.charAt(i),1);
            }
        }
        System.out.println(map_character_value);
    }


}
