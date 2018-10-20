import java.util.*;
import java.util.ArrayList;
public class ch{
     public static void main(String aa[]){
    int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    int pl=1;
    int cnt=0;
   int b[]=new int[a];
   for(int i=0;i<a;i++){
       b[i]=s.nextInt();
   }
   for(int i=0;i<b.length;i++){
       if(b[i]!=pl){
           cnt++;
       }
       pl++;
   }
   System.out.println(cnt);
   }
}