import java.util.*;

public class Pro29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long nsd = input.nextInt();
        input.close();
        List<Long> xsd = new ArrayList<>();
        int countsd = 0;
        for (long isd = nsd; isd >= nsd / 2; isd--) {
            if (isd + sumOfTheDigitssd(isd) == nsd) {
                xsd.add(isd);
                countsd++;
                break;
            }
        }

        System.out.println(countsd);
        for (int i = 0; i < xsd.size(); i++)
            System.out.println(xsd.get(i));

    }

    private static long sumOfTheDigitssd(long n) {
        long sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}