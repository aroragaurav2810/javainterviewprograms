import java.util.Arrays;

public class AnagramStrings_ReTest
{



    static void main() {
        String str1="silent";
        String str2="listen";
        if(str1.length()!=str2.length())
        {
            System.out.println("They can't be a candidate of anagram strings since their length is different");
            System.exit(0);
        }
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String new_str1=Arrays.toString(arr1);
        String new_str2=Arrays.toString(arr2);
         if(new_str1.equals(new_str2))
        {
            System.out.println("Anagram strings");
        }
        else
        {
            System.out.println("Not anagram strings");
        }

    }


}
