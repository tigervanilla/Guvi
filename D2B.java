import java.io.*;
import java.util.*;

/**
 * D2B
 */
public class D2B {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        d2b(n);
    }
    public static void d2b(int n) {
        if(n>1)
            d2b(n/2);   
        System.out.print(n%2);
    }
}