package programs_restested;

public class ReverseEachWordInAString_ReTest
{

    static void main() {
        String str="Sometimes you need to pull back to launch further";
        String reverse_str="";
        String arr[]=str.split(" ");
        for(String word:arr)
        {
            String reverse_word="";
            for(int i=word.length()-1;i>=0;i--)
            {
                reverse_word=reverse_word+word.charAt(i);
            }
            reverse_str=reverse_str+reverse_word+" ";
        }
        System.out.println(reverse_str);
    }

}
