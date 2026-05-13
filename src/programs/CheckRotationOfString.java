package programs;

public class CheckRotationOfString
{
    // check if "cdab" is rotation of "abcd"

    static void main() {

        String str1="abcd";
        char arr[]=str1.toCharArray();
        String rotation_string="cdab";
        boolean isRotationFound=false;
        for(int i=0;i<arr.length;i++)
        {
            char temp = arr[0];
            for(int j=1;j<arr.length;j++) {
                   // temp = 'a', 'b'
                arr[j-1] = arr[j]; // j=0,1,2  new_arr={b,c,d}
            }
            arr[arr.length - 1] = temp;
            if(rotation_string.equalsIgnoreCase(String.valueOf(arr)))
            {
                System.out.println(String.valueOf(arr));
                isRotationFound=true;
                break;
            }
        }
        if(isRotationFound)
        {
            System.out.println("yes, we found a rotation string: "+String.valueOf(arr));
        }
        else
        {
            System.out.println("We haven't found a rotation string: "+String.valueOf(arr));
        }


    }


}
