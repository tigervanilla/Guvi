import java.util.*;

public class Pro18 {
    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        int n = INPUT.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = INPUT.nextInt();
        }
        int[] res = longestsignsFUNC(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        INPUT.close();
    }
    public static int[] longestsignsFUNC(int[] a, int n) {
        int[] countKATA = new int[n];
        countKATA[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] * a[i + 1] <= 0) {
                countKATA[i] = countKATA[i + 1] + 1;
            } else {
                countKATA[i] = 1;
            }
        }
        return countKATA;
    }
}