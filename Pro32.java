import java.util.*;

public class Pro32 {

    public static void main(String[] args) {
        Scanner sKATA = new Scanner(System.in);
        int rKATA, cKATA, jKATA;
        rKATA = sKATA.nextInt();
        cKATA = sKATA.nextInt();
        int a[][] = new int[rKATA][cKATA];
        int arrKATA[] = new int[15];
        for (int iKATA = 0; iKATA < rKATA; iKATA++) {
            for (jKATA = 0; jKATA < cKATA; jKATA++) {
                a[iKATA][jKATA] = sKATA.nextInt();
            }
        }
        for (int iKATA = 0; iKATA < rKATA; iKATA++) {
            for (jKATA = 0; jKATA < cKATA; jKATA++) {
                arrKATA[jKATA] = a[iKATA][jKATA];
            }
            for (int k = 0; k < cKATA; k++) {
                for (int l = k + 1; l < cKATA; l++) {
                    if (arrKATA[k] > arrKATA[l]) {
                        int temp = arrKATA[k];
                        arrKATA[k] = arrKATA[l];
                        arrKATA[l] = temp;
                    }
                }
            }
            for (int jKATA1 = 0; jKATA1 < cKATA; jKATA1++) {
                a[iKATA][jKATA1] = arrKATA[jKATA1];
            }
        }
        for (int iKATA = 0; iKATA < cKATA; iKATA++) {
            for (jKATA = 0; jKATA < rKATA; jKATA++) {
                arrKATA[jKATA] = a[jKATA][iKATA];
            }
            for (int k = 0; k < rKATA; k++) {
                for (int l = k + 1; l < rKATA; l++) {
                    if (arrKATA[k] > arrKATA[l]) {
                        int temp = arrKATA[k];
                        arrKATA[k] = arrKATA[l];
                        arrKATA[l] = temp;
                    }
                }
            }
            for (int jKATA1 = 0; jKATA1 < rKATA; jKATA1++) {
                a[jKATA1][iKATA] = arrKATA[jKATA1];
            }
        }
        for (int iKATA = 0; iKATA < rKATA; iKATA++) {
            for (int jKATA1 = 0; jKATA1 < cKATA; jKATA1++) {
                System.out.print(a[iKATA][jKATA1] + " ");
            }
            System.out.println();
        }

    }

}