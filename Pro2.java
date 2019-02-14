import java.io.*;
import java.util.*;

/**
 * Pro2
 */
public class Pro2 {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer tokenizer=new StringTokenizer(br.readLine()," ");
        String num=tokenizer.nextToken();
        int k=Integer.parseInt(tokenizer.nextToken());
        buildSmallestNumber(num,k,sb);
        System.out.println(sb);
    }
    public static void buildSmallestNumber(String num, int k, StringBuilder sb){
        if(k==0){
            sb.append(num);
            return;
        }else if(k>=num.length()){
            sb.append("");
            return;
        }else{
            // char min=num.charAt(0);
            int minIndex=0;
            for(int i=1;i<k+1;i++){
                if(num.charAt(i)<num.charAt(minIndex))
                    minIndex=i;
            }
            sb.append(num.charAt(minIndex));
            buildSmallestNumber(num.substring(minIndex+1), k-minIndex, sb);
        }
    }
}