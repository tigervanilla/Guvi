import java.util.Scanner;

public class Pro10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int mtr = str.length();
        int jtr = 0;
        int ttr, ntr, ktr;
        for (int itr = 0; itr < mtr; itr++) {
            ttr = str.charAt(itr) - '0';
            if (ttr == str.charAt(mtr - 1) - '0') {
                ntr = str.charAt(0) - '0';
                ktr = pow(ttr, ntr);
            } else {
                ntr = str.charAt(itr + 1) - '0';
                ktr = pow(ttr, ntr);
            }
            jtr = jtr + ktr;
        }
        System.out.println(jtr);
    }

    static int pow(int targ, int narg) {
        int total = 1;
        for (int iarg = 1; iarg <= narg; iarg++) {
            total *= targ;
        }
        return total;
    }
}