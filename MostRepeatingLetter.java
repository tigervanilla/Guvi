import java.util.*;

public class MostRepeatingLetter{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();
        word=word.toLowerCase();
        System.out.println(word);
        int[] freq=new int[26];
        for(int i=0;i<word.length();i++){
            int t=(int)word.charAt(i);
            if(t>=97 && t<=122)
                freq[t-97]++;
        }
        int max=0;
        for(int i=1;i<26;i++)
            if(freq[i]>freq[max])
                max=i;
        System.out.println((char)(max+97));
        input.close();
    }
}