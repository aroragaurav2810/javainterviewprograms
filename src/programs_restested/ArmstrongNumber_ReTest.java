package programs_restested;

// Number=163 , Armstrong of number would be 1*1*1+6*6*6+3*3*3

public class ArmstrongNumber_ReTest
{

    static void main() {

            int number=163;
            String number_in_string_format=String.valueOf(number);
            int sum=0;
            for(int i=0;i<number_in_string_format.length();i++)
            {
                        int multiply=1;
                for(int j=0;j<number_in_string_format.length();j++)
                {
                    multiply=multiply*Integer.parseInt(number_in_string_format.charAt(i)+"");
                }
                sum=sum+multiply;

            }
        System.out.println(sum);

    }

}


