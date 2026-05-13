package programs;

import java.util.Arrays;

public class AnagramStrings
{
    // Anagram Strings
    // listen(eilnst) and  silent(eilnst) are anagram. Reason: their sorted string are same:
    // The size of these two string should be of same length


    static void main() {


        String str1="listens";
        String str2="silents";
        if(str1.length()!=str2.length())
        {
            System.out.println("These two strings have different length and so they can't be considered anagrams");
            System.exit(0);
        }
        char char_arr1[]=str1.toCharArray();
        Arrays.sort(char_arr1);
        String str1_sorted=Arrays.toString(char_arr1);
        System.out.println(str1_sorted);

        char char_arr2[]=str2.toCharArray();
        Arrays.sort(char_arr2);
        String str2_sorted=Arrays.toString(char_arr2);
        System.out.println(str2_sorted);
        if(str1_sorted.equalsIgnoreCase(str2_sorted))
        {
            System.out.println("String are anagram in nature");
        }
        else
        {
            System.out.println("String are not anagram in nature");
        }

    }



}
