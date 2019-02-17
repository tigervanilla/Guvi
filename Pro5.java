import java.io.*;
import java.util.*;

public class Pro5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int mvar = str.length();
        int jvar = 0;
        int gvar, nvar, kvar;
        for (int i = 0; i < mvar; i++) {
            gvar = str.charAt(i) - '0';
            if (gvar == str.charAt(mvar - 1) - '0') {
                nvar = str.charAt(0) - '0';
                kvar = pow(gvar, nvar);
            } else {
                nvar = str.charAt(i + 1) - '0';
                kvar = pow(gvar, nvar);
            }
            jvar = jvar + kvar;
        }
        System.out.println(jvar);
        input.close();
    }

    static int pow(int g, int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= g;
        }
        return total;
    }
}