package programs;

public class FindLongestWordInASentence

{


    static void main() {
        String str="sometimes you need to pull back to launching further";
        String str_arr[]=str.split(" ");
        String longest_word=str_arr[0];
        for(int i=1;i< str_arr.length;i++)
        {
            if(str_arr[i].length()>longest_word.length())
            {
                longest_word=str_arr[i];
            }
        }
        System.out.println(longest_word);

    }


}
