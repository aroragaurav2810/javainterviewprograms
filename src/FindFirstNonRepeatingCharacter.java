import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter
{
    static String str="abcabdccef";   // If str="aabbcde" then the output will be c.
    static void main()
    {

        Map<Character, Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else
            {
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
        for(Character key:map.keySet())
        {
            if(map.get(key)==1)
            {
                System.out.println("This is the first non repeated character "+key);
                break;
            }

        }
    }
}


