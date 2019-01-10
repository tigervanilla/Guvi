import java.util.Scanner;

/**
 * HunterQ7
 */
public class HunterQ7 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            int temp=input.nextInt();
            if((i%2!=0&&temp%2==0)||(i%2==0&&temp%2!=0))
                System.out.print(temp+" ");
        }
        input.close();
    }
}