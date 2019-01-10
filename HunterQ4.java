import java.util.Scanner;

/**
 * HunterQ4
 */
public class HunterQ4 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int ans=0;
        for(int i=0;i<n;i++)
            ans=ans^input.nextInt();
        System.out.println(ans);
        input.close();
    }
}