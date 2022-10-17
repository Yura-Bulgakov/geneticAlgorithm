package picking;

import functions.funcOneVar;
import population.population;

import static population.population.popSize;

public class tournamentPicker extends picker {

    public static int getRandomNumber() {
        return (int) (Math.random() * popSize);
    }

    public static void tournamentForFour(double[] x) {
        int[] newNum = new int[4];
        double[] f = new double[4];
        for (int i = 0; i < Math.ceil(popSize * 1.0 / 2); i++) {
            for (int j = 0; j < 4; j++) {
                newNum[j] = getRandomNumber();
                f[j] = funcOneVar.func(x[newNum[j]]);
            }


        }


    }
}
