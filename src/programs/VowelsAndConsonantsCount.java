package programs;

public class VowelsAndConsonantsCount

{

    public static void main()
    {
    String str="my life is long enough";
    String str_new=str.replace("","");
    System.out.println("New string lenght is: "+str_new.length());
    String vowels="aeiou";
    int vowels_count=0;
    int consonants_count=0;
    for(int i=0;i<str_new.length();i++)
    {
        if(vowels.contains(str.charAt(i)+""))
        {
            vowels_count++;
        }
        else
        {
            consonants_count++;
        }
    }
        System.out.println("Vowels count is: "+vowels_count);
        System.out.println("Consonants count is: "+consonants_count);


    }

}
