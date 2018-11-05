import java.util.*;
import java.lang.*;
import java.io.*;

class Anagram {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int count=0;
		while(t-->0){
		    try{
		        String a=input.next();
		        if(isAnagram(a,"kabali"))
		            count++;
		    }catch(Exception e){
		        break;
		    }
        }
        System.out.println(count);
        input.close();
	}
	public static boolean isAnagram(String a,String b){
	    int[] freq=new int[26];
	    int lena=a.length(),lenb=b.length();
	    for(int i=0;i<lena;i++)
	        freq[(int)a.charAt(i)-97]++;
	    for(int i=0;i<lenb;i++)
	        freq[(int)b.charAt(i)-97]--;
	    for(int i=0;i<freq.length;i++)
	        if(freq[i]!=0)
	            return false;
	    return true;
	}
}