public class RevereseAString
{

    static void main() {
        String str="gaurav";
        System.out.println("Original string is: "+str);
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println("Reverse string using string builder: "+sb);

        System.out.println("----------------------------------------");

        String reverse_string="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse_string=reverse_string+str.charAt(i);
        }
        System.out.println("Reverse string using reverse loop: "+reverse_string);

        System.out.println("----------------------------------------");

        char []char_arr=str.toCharArray();
        int left_index=0;
        int right_index =char_arr.length-1;
        while(left_index< right_index)
        {
            char temp=char_arr[left_index];
            char_arr[left_index]=char_arr[right_index];
            char_arr[right_index]=temp;
            left_index++;
            right_index--;
        }
        System.out.println("Reverse a string using while loop left and right index logic: "+new String(char_arr));

    }

}
