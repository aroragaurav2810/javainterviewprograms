public class FindFirstNonRepeatingCharacter_ReTest
{

    static void main() {
        String str="gaguravarora";

        for(int i=0;i<str.length();i++)
        {
            boolean repeatedcharacter=false;
            for(int j=0;j<str.length();j++)
            {
                if(i!=j && str.charAt(i)==str.charAt(j))
                {
                    repeatedcharacter=true;
                    break;
                }
            }
            if(!repeatedcharacter)
            {
                System.out.println("This is first non repeated character "+str.charAt(i));
                break;
            }
        }

    }


}
