import java.io.*;
import java.util.*;

public class Pro7 {
    public static void main(String[] args) {
        int nvar;
        int cnt = 0;
        Scanner input = new Scanner(System.in);
        nvar = input.nextInt();
        for (int i = 1; i <= nvar; i++) {
            for (int j = 1; j <= nvar; j++) {
                int p = (int) Math.pow(2, j);
                if (p == i) {
                    cnt++;
                }
            }

        }
        int lvar = (nvar + 1) - cnt;
        System.out.println(lvar);
    }
}