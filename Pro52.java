import java.io.*;
import java.util.*;

public class Pro52 {
    public static void main(String[] args) {
        Scanner inKATA = new Scanner(System.in);
        int indexKATA = 0, countKATA = 0;
        int[] arrayKATA = new int[8];
        for (indexKATA = 0; indexKATA < 8; indexKATA++)
            arrayKATA[indexKATA] = inKATA.nextInt();
        Arrays.sort(arrayKATA);
        for (indexKATA = 0; indexKATA < 4; indexKATA++) {
            if ((2 * arrayKATA[indexKATA]) == (arrayKATA[indexKATA + 4])) {
                countKATA++;
            }
        }
        System.out.println(countKATA == 4 ? "yes" : "no");
        inKATA.close();
    }
}