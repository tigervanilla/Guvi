import java.io.*;
import java.util.*;

public class Pro6 {
    static int count;

    public static void main(String[] args) {
        Pro6 ob = new Pro6();
        Scanner input = new Scanner(System.in);
        int svar = input.nextInt();
        int arr[] = new int[svar];
        for (int ptr = 0; ptr < svar; ptr++) {
            arr[ptr] = input.nextInt();
        }
        System.out.println(ob.call(arr, svar));
    }

    public int call(int b[], int s1) {
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                for (int k = j + 1; k < b.length; k++) {
                    if (b[i] + b[j] + b[k] == s1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}