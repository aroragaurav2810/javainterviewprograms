package programs_restested;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubStringsOfAString_ReTest

{


    static void main() {
        String str="abc";
        List<String> substring_list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                    substring_list.add(str.substring(i,j));
            }
        }
        System.out.println(substring_list);
    }

}
