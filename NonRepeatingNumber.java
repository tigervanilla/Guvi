import java.util.*;

public class NonRepeatingNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] freq=new int[123456790];
        for(int i=0;i<n;i++)
            freq[input.nextInt()]++;
        for(int i=0;i<10000000;i++){
            if(freq[i]==1){
                System.out.println(i);
                break;
            }
        }
        input.close();
    }
}