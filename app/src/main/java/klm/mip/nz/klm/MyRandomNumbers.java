package klm.mip.nz.klm;

import java.util.Random;

/**
 * Created by mikhailpastushkov on 9/20/16.
 */
public class MyRandomNumbers {
    public static int getWrongAnswer(int max, int... answers) {
        int newWrongAnswer = 0;
        boolean isConsist = true;
        while (isConsist) {
            newWrongAnswer = new Random().nextInt(max);;
            isConsist = false;
            for (int i : answers) {
                if (i == newWrongAnswer && newWrongAnswer >= 0) isConsist = true;

            }
        }
        return newWrongAnswer;
    }
}
