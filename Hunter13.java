import java.io.*;
import java.util.*;

/**
 * Hunter13
 */
public class Hunter13 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        Deque<Character> stack=new LinkedList<>();
        for(int i=0;i<s.length();i++) 
            stack.offerFirst(s.charAt(i));
        StringBuilder sb=new StringBuilder();
        Iterator itr=stack.iterator();
        while(itr.hasNext())
            sb.append(itr.next());
        String r=sb.toString();
        if(s.equals(r)) System.out.println("YES");
        else System.out.println("NO");
        input.close();
    }
}