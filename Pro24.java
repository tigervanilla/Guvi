import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Pro24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nvar = input.nextInt();
        int[] array = new int[1 << nvar];

        for (int itr = 0; itr < (1 << nvar); itr++) {
            array[itr] = itr;
        }

        for (int itr = 0; itr < (1 << nvar); itr++) {
            for (int jtr = itr + 1; jtr < (1 << nvar); jtr++) {
                if (noOfOnesInBinary(array[itr], nvar) > noOfOnesInBinary(array[jtr], nvar)) {
                    array = swap(array, itr, jtr);
                } else if (noOfOnesInBinary(array[itr], nvar) == noOfOnesInBinary(array[jtr], nvar)) {
                    if (array[itr] > array[jtr]) {
                        array = swap(array, itr, jtr);
                    }
                }
            }
        }

        for (int i = 0; i < (1 << nvar); i++)
            System.out.println(convertToBinary(array[i], nvar));

        input.close();
    }

    static int[] swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
        return array;
    }

    static String convertToBinary(int decimal, int n) {
        String binary = new String();
        while (decimal != 0) {
            if (decimal % 2 == 0)
                binary = "0" + binary;
            else
                binary = "1" + binary;
            decimal /= 2;
        }
        char[] repeat = new char[n - binary.length()];
        Arrays.fill(repeat, '0');
        binary = new String(repeat) + binary;
        return binary;
    }

    static int noOfOnesInBinary(int decimal, int n) {
        int count = 0;
        String binary = convertToBinary(decimal, n);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}