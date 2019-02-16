import java.io.*;
import java.util.Scanner;

public class Pro61{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        String b=input.nextLine();
        for(int i=0;i<a.length();i++){
            int c=(int)a.charAt(i)+(int)b.charAt(i)-96*2;
            if(c>26) c%=26;
            System.out.print((char)(c+96));
        }
        input.close();
    }
}