import java.util.*;

public class Pro60 {
    public static void main(String[] args) {
        Scanner scKATA = new Scanner(System.in);
        int t = scKATA.nextInt();
        int counterValueKATA = 3;
        int currentInitialValueKATA = 3;
        for (int i = 1; i < t; i++) {
            counterValueKATA--;
            if (counterValueKATA == 0) {
                counterValueKATA = 2 * currentInitialValueKATA;
                currentInitialValueKATA = counterValueKATA;
            }
        }
        System.out.println(counterValueKATA);
        scKATA.close();
    }
}