import java.io.*;
import java.util.*;

/**
 * HunterQ10
 */
public class HunterQ10 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        HashSet<Integer> a=new HashSet<>(n);
        for(int i=0;i<n;i++) a.add(input.nextInt());
        boolean isSubset=true;
        for(int i=0;i<m;i++){
            if(!a.contains(input.nextInt()))
             isSubset=false;
        }
        if(isSubset) System.out.println("YES"); 
        else System.out.println("NO");
    }
}