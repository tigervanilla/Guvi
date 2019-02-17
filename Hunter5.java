import java.io.*;
import java.util.*;

public class Hunter5 {
    public static void main(String[] args) {
        int aVAR;
        String ddVAR = " ";
        Scanner input = new Scanner(System.in);
        aVAR = input.nextInt();
        String bVAR = String.valueOf(aVAR);
        char cVAR[] = bVAR.toCharArray();
        HashMap<Integer, Character> pVAR = new HashMap<Integer, Character>();
        char vVAR = 'A';
        int countVAR = 0;
        for (int iVAR = 1; iVAR < 26; iVAR++) {
            pVAR.put(iVAR, vVAR);
            vVAR++;
        }
        for (int iVAR = 0; iVAR < cVAR.length; iVAR++) {
            int c1VAR = Character.getNumericValue(cVAR[iVAR]);
            if (pVAR.containsKey(c1VAR)) {
                char tVAR = pVAR.get(c1VAR);
                ddVAR = ddVAR + tVAR;
                countVAR++;
            }
        }
        System.out.println(ddVAR+"\n"+(countVAR-1));
        input.close();
    }
}