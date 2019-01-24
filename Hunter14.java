import java.io.*;

public class Hunter14{
    BufferedReader br;
    StringBuilder sb;
    public static void main(String[] args)throws IOException {
        Hunter14 ob=new Hunter14();
        String str=ob.br.readLine();
        ob.makePermutations("", str);
        System.out.println(ob.sb);
    }
    public void makePermutations(String prefix,String str){
        int n=str.length();
        if(n==0) sb.append(prefix+"\n");
        else{
            for (int i = 0; i < n; i++) {
                makePermutations(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1, n));
            }
        } 
    }
    public Hunter14(){
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
    }
}