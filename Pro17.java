import java.io.*;
import java.util.*;

public class Pro17 {
    static int pKATA;
    public static void main(String args[]) {
        Pro17 s = new Pro17();
        Scanner s1KATA = new Scanner(System.in);
        int n1KATA = s1KATA.nextInt();
        int k1KATA = s1KATA.nextInt();
        boolean ressKATA = s.method(n1KATA, k1KATA);
        if (ressKATA) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public boolean method(int n, int k) {
        Scanner s1KATA = new Scanner(System.in);
        int a[] = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = s1KATA.nextInt();
        }
        outerKATA: for (int j = 0; j < k; j++) {
            for (int k1KATA = j + 1; k1KATA < k; k++) {
                if ((a[j] + a[k1KATA]) == n) {
                    pKATA = 1;
                    break outerKATA;
                }
            }
        }
        if (pKATA == 1) {
            return true;
        } else {
            return false;
        }
    }
}