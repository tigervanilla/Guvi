import java.util.*;

public class Pro33 {
    public static void main(String[] args) {
        Scanner scKATA = new Scanner(System.in);
        String sKATA = scKATA.nextLine();
        int n = sKATA.length();
        int xcKATA = 0;
        for (int i = 1; i < n; i++) {
            if (sKATA.charAt(0) < sKATA.charAt(i)) {
                xcKATA = i;
                break;
            }
        }
        if (xcKATA == 0) {
            System.out.print("lexicographic substring is absent");
        } else {
            for (int i = xcKATA; i < n; i++) {
                System.out.print(sKATA.charAt(i));
            }
        }
        scKATA.close();
    }
}