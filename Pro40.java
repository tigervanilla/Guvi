import java.io.*;
import java.util.*;

public class Pro40{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word=input.next();
        int[] ar=new int[26];
        ar[(int)'d'-97]--;
        ar[(int)'h'-97]--;
        ar[(int)'o'-97]--;
        ar[(int)'n'-97]--;
        ar[(int)'i'-97]--;
        for (int i = 0; i < word.length(); i++) {
            ar[(int)word.charAt(i)-97]++;
        }
        boolean flag=true;
        for(int ele:ar)
            if(ele!=0){
                flag=false;
                break;
            }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
        input.close();
    }
}