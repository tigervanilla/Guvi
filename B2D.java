import java.io.*;
import java.util.*;

/**
 * B2D
 */
public class B2D {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(b2d(n));
    }
    public static int b2d(int n) {
        int i=1,d=0;
        while(n>0){
            int r=n%10;
            d=d+r*i;
            i*=2;
            n/=10;
        }
        return d;
    }
}