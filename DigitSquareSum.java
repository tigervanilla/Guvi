import java.util.*;

public class DigitSquareSum{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] freq=new int[10];
        while(n>0){
            freq[n%10]++;
            n/=10;
        }
        int ans=0;
        for(int i=1;i<10;i++)
            ans=ans+freq[i]*i*i;
        System.out.println(ans);
    }
}
