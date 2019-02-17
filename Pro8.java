import java.util.*;

public class Pro8 {
    public static void main(String[] args) {
        int nuvar = 0;
        int cnt = 2;
        Scanner input = new Scanner(System.in);
        nuvar = input.nextInt();
        boolean flag[] = new boolean[nuvar];
        for (int i = 0; i < nuvar; i++) {
            flag[i] = true;
        }
        flag[nuvar - 1] = false;
        for (int j = nuvar - 1; j > 1; j--) {
            if (flag[j] == false) {
                flag[j - 1] = true;
                cnt++;
                flag[j - 2] = false;
                cnt++;
            } else if (flag[j] == true) {
                flag[j] = false;
                cnt++;
                flag[j - 1] = true;
                cnt++;
                flag[j - 2] = false;
                cnt++;
            }
        }
        for (int i = 1; i < nuvar - 1; i++) {
            flag[i + 1] = true;
            cnt++;
            flag[i] = false;
            cnt++;
        }
        flag[nuvar - 1] = false;
        System.out.println(cnt);
        input.close();
    }
}