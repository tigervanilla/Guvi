import java.io.*;
import java.util.*;

/**
 * Hunter20
 */
public class Hunter20 {

    public static void main(String[] args) {
        boolean[] sieve={false,false,true,true,false,true,false,true,false,false,false,true,false,true, false,false,false,true,false,true,false};
        Scanner input=new Scanner(System.in);
        int a=input.nextInt(),b=input.nextInt();
        int ans=0;
        for (int i = a; i < b+1; i++) {
            String bin=Integer.toBinaryString(i);
            int freq1=0;
            for (int j = 0; j < bin.length(); j++) {
                if(bin.charAt(j)=='1') freq1++;
            }
            if(sieve[freq1]) ans++;
        }
        System.out.println(ans);
    }
}