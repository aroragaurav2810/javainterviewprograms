package programs;

// ArmstrongNumber = Sum of each digit raised to the power of total digits
// 153 = 1 ki power 3 + 5 ki power 3 + 3 ki power 3 = 1+125+27=143

public class ArmstrongNumber {

    static void main() {


    int number= 253;
    String number_in_string=String.valueOf(number);
    int length_of_number=number_in_string.length();
    int sum=0;
    for(int i=0;i<length_of_number;i++)
    {
        int multiply=1;
        for(int j=0;j<length_of_number;j++) {
            multiply = multiply * Integer.parseInt(number_in_string.charAt(i)+"") ;
        }
        sum=sum+multiply;
    }
        System.out.println(sum);

    }
}
