public class RemoveDuplicateCharactersInWords
{


    static void main() {

        String str_with_spaces = "sometimes you need to pullback";
        System.out.println("Original string is "+str_with_spaces);
        String str_array[] = str_with_spaces.split(" ");
        String result_str = "";

        for (String str : str_array) {
            String temp_str="";
            for (int i = 0; i < str.length(); i++) {
                if (temp_str.contains(str.charAt(i) + "")) {

                } else {
                    temp_str = temp_str + str.charAt(i);
                }

            }
            result_str=result_str+temp_str+" ";
        }
        System.out.println("String after removing duplicate characters in words is: " + result_str);
    }


}
