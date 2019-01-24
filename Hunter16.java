import java.io.*;
import java.util.*;

/**
 * Hunter16
 */
public class Hunter16 {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inpuTokenizer=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(inpuTokenizer.nextToken());
        int k=Integer.parseInt(inpuTokenizer.nextToken());
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
        inpuTokenizer=new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            int temp=Integer.parseInt(inpuTokenizer.nextToken());
            int key=Math.abs(k-temp);
            if(key==0) continue;
            String value=tm.get(key);
            if(value==null){tm.put(key, String.valueOf(temp));}
            else{
                value=value+" "+temp;
                tm.put(key,value);
            }
        }
        Set set=tm.entrySet();
        Iterator itr=set.iterator();
        int cnt=0;
        while (itr.hasNext() && cnt<3) {
            Map.Entry me=(Map.Entry)itr.next();
            StringTokenizer tokenizer=new StringTokenizer(String.valueOf(me.getValue())," ");
            while(tokenizer.hasMoreTokens() && cnt<3){
                System.out.print(tokenizer.nextToken()+" ");
                cnt++;
            }
        }
        // int[] ar=new int[n];
        // inpuTokenizer=new StringTokenizer(br.readLine()," ");
        // for(int i=0;i<n;i++)
        //     ar[i]=Math.abs(k-Integer.parseInt(inpuTokenizer.nextToken()));
        // Arrays.sort(ar);
        // System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
    }
}