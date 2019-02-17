import java.util.*;

public class Pro14 {
    public static int indexingFUNC(int uKATA, int vKATA, int[] aKATA) {
        int xorKATA = aKATA[uKATA - 1];
        for (int iKATA = uKATA; iKATA < vKATA; iKATA++) {
            xorKATA = xorKATA ^ aKATA[iKATA];
        }
        return xorKATA;
    }
    public static void main(String[] args) {
        Scanner scKATA = new Scanner(System.in);
        int nKATA = scKATA.nextInt();
        int qKATA = scKATA.nextInt();
        int aKATA[] = new int[nKATA];
        int uKATA = 0, vKATA = 0;
        for (int iKATA = 0; iKATA < nKATA; iKATA++) {
            aKATA[iKATA] = scKATA.nextInt();
        }
        for (int iKATA = 0; iKATA < qKATA; iKATA++) {
            uKATA = scKATA.nextInt();
            vKATA = scKATA.nextInt();
            System.out.println(indexingFUNC(uKATA, vKATA, aKATA));
        }
        scKATA.close();
    }
}