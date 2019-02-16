import java.io.*;
import java.util.*;

/**
 * Pro53
 */
public class Pro53 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String sentence=input.nextLine().toLowerCase();
        int[] ar=new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch=sentence.charAt(i);
            if (ch>='a'&&ch<='z') {
                ar[(int)ch-97]++;
            }
        }
        boolean isAnagram=true;
        for (int ele : ar) {
            if (ele==0) {
                isAnagram=false;
                break;
            }
        }
        if(isAnagram)
            System.out.println("YES");
        else
            System.out.println("NO");
        input.close();
    }
}