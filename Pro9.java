import java.util.*;

public class Pro9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ntr = input.nextInt();
        input.close();
        int ctr = 2 * ntr;
        int cnt = 0;
        for (int itr = 0, jtr = 1; itr < ctr && jtr < ctr; itr += 2, jtr += 2) {
            cnt++;
        }
        System.out.println(cnt);
    }
}