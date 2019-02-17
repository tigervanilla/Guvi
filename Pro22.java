import java.util.*;
public class Pro22 {
	public static void main(String[] args) {
		int sumvar = 0;		
		Scanner input = new Scanner(System.in);
		int sizevar = input.nextInt();
		int arr[] = new int[sizevar];
		for(int itr=0;itr<arr.length;itr++)
		{
			arr[itr] = input.nextInt();
		}
		for(int jtr=0;jtr<arr.length;jtr++)
		{
			if(jtr%2==0)
			{
				sumvar = sumvar + arr[jtr];
			}  
		}
        System.out.println(sumvar);
        input.close();
	}

}