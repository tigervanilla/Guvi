import java.util.Arrays;
import java.util.Scanner;

/**
 * HunterQ2
 */
public class HunterQ2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        Arrays.sort(ar);
        for(int i=ar.length-1;i>=0;i--)
            System.out.print(ar[i]);
        input.close();
    }
}