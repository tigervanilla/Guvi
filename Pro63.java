import java.util.*;

public class Pro63 {
    public static void main(String[] args) {
        Scanner scKATA = new Scanner(System.in);
        String aKATA = scKATA.next();
        char chKATA[] = aKATA.toCharArray();
        int nKATA = aKATA.length();
        int iKATA, countKATA = 1, jKATA, bKATA= 0, cKATA = 0;
        for (iKATA = 1; iKATA < nKATA; iKATA++) {
            bKATA = 0;
            for (jKATA = 0; jKATA < iKATA; jKATA++) {
                if (chKATA[iKATA] == chKATA[jKATA]) {
                    bKATA = 1;
                    countKATA = 0;
                    jKATA = iKATA;
                }
            }
            if (bKATA == 0) {
                countKATA++;
            }
            if (countKATA > cKATA) {
                cKATA = countKATA;
            }
        }
        System.out.println(cKATA);
    }
}