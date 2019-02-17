import java.io.*;
import java.util.*;

public class Pro30 {
    public static void main(int n) {
        int iGFG, pGFG, rGFG;
        for (iGFG = 0; iGFG < 10; iGFG++) {
            pGFG = n;
            while (pGFG != 0) {
                rGFG = pGFG % 10;
                if (rGFG == iGFG) {
                    System.out.print(rGFG);
                }
                pGFG = pGFG / 10;
            }
        }
    }
}