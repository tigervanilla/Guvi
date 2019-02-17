import java.util.*;
import java.io.*;

public class Pro28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int naz = input.nextInt();
        int[] queueaz = new int[naz];

        for (int iaz = 0; iaz < naz; iaz++)
            queueaz[iaz] = input.nextInt();

        Arrays.sort(queueaz);

        int waitingTimeaz = 0;
        int notDisappointedaz = 0;

        for (int iaz = 0; iaz < naz; iaz++) {
            if (waitingTimeaz <= queueaz[iaz])
                notDisappointedaz++;
            waitingTimeaz += queueaz[iaz];
        }
        System.out.println(notDisappointedaz);
        input.close();
    }
}