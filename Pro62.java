import java.util.*;
class LKATA{
    Scanner scanKATA = new Scanner(System.in);
    int jKATA;
    String s2KATA, s4KATA;
    void getd() {
        String sKATA = scanKATA.nextLine();
        char aKATA[] = sKATA.toCharArray();
        int maxKATA = 0;
        for (int iKATA = 0; iKATA < (aKATA.length - 1); iKATA++) {
            for (jKATA = iKATA + 1; jKATA < (aKATA.length); jKATA++) {
                if (aKATA[iKATA] == aKATA[jKATA]) {
                    s2KATA = sKATA.substring(iKATA, jKATA + 1);
                    StringBuffer s3KATA = new StringBuffer(s2KATA);
                    StringBuffer s6KATA = new StringBuffer();
                    s4KATA = s2KATA;
                    s3KATA.reverse();
                    if (s2KATA.equals(s3KATA.toString())) {
                        s6KATA.append(s3KATA);
                        if (s2KATA.length() > maxKATA)
                            maxKATA = s2KATA.length();
                    }
                } 
            } 
        }
        System.out.print(sKATA.length() - maxKATA);
    }
}
public class Pro62 {
    public static void main(String[] args) {
        LKATA pKATA = new LKATA();
        pKATA.getd();
    }
}