import java.util.Scanner;

/**
 * HunterQ2
 */
public class HunterQ2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(input.nextInt()==i){
                flag=true;
                System.out.print(i+" ");
            }
        }
        if(!flag)   System.out.println(-1);
        input.close();
    }
}