import java.io.*;
import java.util.*;

public class Pro31 {
    public static void main(String[] args) {
        Scanner inKATA = new Scanner(System.in);
        int sizeKATA = inKATA.nextInt();
        int[] arrayKATA = new int[sizeKATA];
        for (int i = 0; i < arrayKATA.length; i++) {
            arrayKATA[i] = inKATA.nextInt();
        }
        maxSumFunc(arrayKATA);
        System.out.println(maxSumFunc(arrayKATA));
    }
    private static int maxSumFunc(int[] arrayKATA) {
        int maxKATA = arrayKATA[0];
        for (int i = 0; i < arrayKATA.length; i++) {
            for (int j = i + 1; j < arrayKATA.length; j++) {
                int currentMaxKATA= arrayKATA[i] + arrayKATA[j];
                if (currentMaxKATA> maxKATA) {
                    maxKATA = currentMaxKATA;
                }
            }
        }
        return maxKATA;
    }
}