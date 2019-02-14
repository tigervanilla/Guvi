import java.io.*;
import java.util.*;

/**
 * Pro27
 */
public class Pro27 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt(), C=input.nextInt();
        int[] wt=new int[n], val=new int[n];
        for (int i = 0; i < n; i++) {
            wt[i]=input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            val[i]=input.nextInt();
        }
        System.out.println(knapsack01(n,C,wt,val));
    }
    public static int knapsack01(int n, int C, int[] wt, int[] val) {
        int[][] knapsack=new int[C+1][n+1];
        for (int i = 1; i < C+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (wt[j-1]>i) {
                    knapsack[i][j]=knapsack[i][j-1];
                }else{
                    knapsack[i][j]=Math.max(knapsack[i-wt[j-1]][j-1]+val[j-1], knapsack[i][j-1]);
                }
            }
        }
        return knapsack[C][n];
    }
}