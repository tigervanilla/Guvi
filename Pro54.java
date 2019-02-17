import java.util.*;

public class Pro54 {
    public static void main(String[] args) {
        Scanner scKATA = new Scanner(System.in);
        int noOfIngredientsKATA = scKATA.nextInt();
        int magicPowderKATA = scKATA.nextInt();
        int[] requiredKATA = new int[noOfIngredientsKATA];
        int[] availableKATA = new int[noOfIngredientsKATA];
        int iKATA, countKATA = 0;
        for (iKATA = 0; iKATA < noOfIngredientsKATA; iKATA++)
            requiredKATA[iKATA] = scKATA.nextInt();
        for (iKATA = 0; iKATA < noOfIngredientsKATA; iKATA++)
            availableKATA[iKATA] = scKATA.nextInt();
        while (true) {
            for (iKATA = 0; iKATA < noOfIngredientsKATA; iKATA++) {
                if (availableKATA[iKATA] - requiredKATA[iKATA] >= 0)
                    availableKATA[iKATA] -= requiredKATA[iKATA];
                else {
                    if (requiredKATA[iKATA] - availableKATA[iKATA] <= magicPowderKATA) {
                        magicPowderKATA -= (requiredKATA[iKATA] - availableKATA[iKATA]);
                        availableKATA[iKATA] = 0;
                    } else
                        break;
                }
            }
            if (iKATA != noOfIngredientsKATA)
                break;
            countKATA++;
        }
        System.out.println(countKATA);
    }
}