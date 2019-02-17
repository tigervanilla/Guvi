import java.util.*;

public class Pro16 {
    public static void main(String args[]) {
        int tmcKATA, mcKATA, nKATA, maxKATA, posKATA, tempKATA, sumKATA;
        sumKATA = posKATA = 0;
        boolean flagKATA = true;
        int aKATA[] = new int[100000];
        Scanner scKATA = new Scanner(System.in);
        nKATA = scKATA.nextInt();
        for (int iKATA = 0; iKATA < nKATA; iKATA++) {
            aKATA[iKATA] = scKATA.nextInt();
            sumKATA = sumKATA + aKATA[iKATA];
        }
        scKATA.close();
        for (int iKATA = 1; (iKATA < nKATA) && (flagKATA); iKATA++) {
            if (aKATA[iKATA] != aKATA[0]) {
                flagKATA = false;
            }
        }
        if (flagKATA) {
            System.out.println(sumKATA);
        }
        if (!flagKATA) {
            maxKATA = aKATA[0];
            for (int iKATA = 1; iKATA < nKATA; iKATA++) {
                if (maxKATA < aKATA[iKATA]) {
                    maxKATA = aKATA[iKATA];
                    posKATA = iKATA;
                }
            }
            if (posKATA == nKATA - 1) {
                tempKATA = aKATA[posKATA - 1];
            } else if (posKATA == 0) {
                tempKATA = aKATA[posKATA + 1];
            } else {
                tempKATA = Math.max(aKATA[posKATA - 1], aKATA[posKATA + 1]);
            }
            mcKATA = tempKATA + 1;
            tmcKATA = mcKATA + sumKATA - maxKATA;
            System.out.println(tmcKATA);
        }
    }
}