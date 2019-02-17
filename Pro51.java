import java.util.*;

public class Pro51 {
    public static int[] longestsignsFUNC(int[] aVAR, int nVAR) {
        int[] countVAR = new int[nVAR];
        countVAR[nVAR - 1] = 1;
        for (int iVAR = nVAR - 2; iVAR >= 0; iVAR--) {
            if (aVAR[iVAR] * aVAR[iVAR + 1] <= 0) {
                countVAR[iVAR] = countVAR[iVAR + 1] + 1;
            } else {
                countVAR[iVAR] = 1;
            }
        }
        return countVAR;
    }

    public static void main(String[] args) {
        Scanner scVAR = new Scanner(System.in);
        int nVAR = scVAR.nextInt();
        int[] aVAR = new int[nVAR];
        for (int iVAR = 0; iVAR < nVAR; iVAR++) {
            aVAR[iVAR] = scVAR.nextInt();
        }
        int[] resVAR = longestsignsFUNC(aVAR, nVAR);
        for (int iVAR = 0; iVAR < nVAR; iVAR++) {
            System.out.print(resVAR[iVAR] + " ");
        }
        scVAR.close();
    }
}