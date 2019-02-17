import java.io.*;
import java.util.*;

public class Pro13 {
	public void solve(int nKATA, String startKATA, String auxillaryKATA, String endKATA) {
		if (nKATA == 1) {
			System.out.println(startKATA + "->" + endKATA);
		} else {
			solve(nKATA - 1, startKATA, endKATA, auxillaryKATA);
			System.out.println(startKATA + "->" + endKATA);
			solve(nKATA - 1, auxillaryKATA, startKATA, endKATA);
		}
	}

	public static void main(String[] args) {
		Pro13 tsKATA = new Pro13();
		Scanner sc = new Scanner(System.in);
		int discs = sc.nextInt();
		tsKATA.solve(discs, "q", "r", "s");
	}
}