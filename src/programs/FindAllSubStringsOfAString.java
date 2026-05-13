package programs;

public class FindAllSubStringsOfAString
{

    // String str = "abc"; Substring will be "a", "ab", "abc", "b", "bc", "c"

    static void main() {
        String str="abc";
        for(int i=0;i<str.length();i++)
        {

            for(int j=i+1;j<=str.length();j++) {

                System.out.print(str.substring(i, j));
                System.out.print("\t");
            }


        }

    }

}
