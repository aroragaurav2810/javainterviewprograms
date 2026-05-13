package programs_restested;

public class FirstLetterCapital_ReTest
{


    static void main() {
        String str="gaurav arora";
        String string_array[]=str.split(" ");
        String new_string="";
        for(int i=0;i<string_array.length;i++)
        {
            new_string=new_string+string_array[i].substring(0,1).toUpperCase()+string_array[i].substring(1)+" ";

        }
        System.out.println(new_string);

    }

}
