import java.io.*;
import java.util.*;

public class Pro57 {
    public static void main(String[] args) {
        String tempKATA = "";
        Boolean flagKATA = false;
        Scanner inKATA = new Scanner(System.in);
        String input1KATA = inKATA.nextLine();
        String input2KATA = inKATA.nextLine();
        int len1KATA = input1KATA.length();
        int len2 = input2KATA.length();
        for (int indexKATA = 0; indexKATA < len1KATA; indexKATA++) {
            for (int indexKATA2 = indexKATA + 2; indexKATA2 < len1KATA; indexKATA2++) {
                String sampleKATA = input2KATA.replaceAll(input1KATA.substring(indexKATA, indexKATA2), "");
                if (!(sampleKATA.equals(input2KATA))) {
                    flagKATA = true;
                    break;
                }
            }
            if (flagKATA == true)
                break;
        }
        if (flagKATA == true) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
        inKATA.close();
    }
}