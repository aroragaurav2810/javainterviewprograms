public class ReverseEachWordInAString
{



    static void main() {

        String str="sometimes you have to pullback to launch further";
        System.out.println("Original string is: "+str);
        String words[]=str.split(" ");
        String reverse_string="";
        for(String word:words)
        {
            String reverse_word="";
            for(int i=word.length()-1;i>=0;i--)
            {
                reverse_word=reverse_word+word.charAt(i);
            }
            reverse_string=reverse_string+reverse_word+" ";
        }
        System.out.println("Reverse string is: "+reverse_string);
    }


}
