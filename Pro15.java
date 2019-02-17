import java.util.*;

public class Pro15 {
    public static void main(String[] args) {
        Scanner sKATA = new Scanner(System.in);
        int nKATA = sKATA.nextInt();
        LinkedList<Integer> lKATA = new LinkedList<Integer>();
        for (int iKATA = 0; iKATA < nKATA; iKATA++) {
            lKATA.add(sKATA.nextInt());
        }
        lKATA.sort(null);
        Iterator itrKATA = lKATA.descendingIterator();
        while (itrKATA.hasNext()) {
            System.out.println(itrKATA.next());
        }
        sKATA.close();
    }
}