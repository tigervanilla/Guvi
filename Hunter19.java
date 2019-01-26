import java.io.*;
import java.util.*;

/**
 * Hunter19
 */
public class Hunter19 {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inputTokenizer=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(inputTokenizer.nextToken());
        int k=Integer.parseInt(inputTokenizer.nextToken());
        HashMap<String,Integer> hmap=new HashMap<>();
        for(int i=1;i<=n;i++){
            inputTokenizer=new StringTokenizer(br.readLine()," ");
            while (inputTokenizer.hasMoreTokens()) {
                String key=inputTokenizer.nextToken();
                if(hmap.get(key)!=null){
                    hmap.put(key,Math.min(i,hmap.get(key)+1));
                }else{
                    hmap.put(key,1);
                }
            }
        }
        Set set=hmap.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry me=(Map.Entry) itr.next();
            if((int)me.getValue()==n) System.out.print(me.getKey()+" ");
        }
    }
}