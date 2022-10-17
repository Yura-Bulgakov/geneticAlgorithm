package functions;

import population.population;

import static population.population.popSize;

public class funcOneVar extends function {
    public static double bestOneVarY = Double.POSITIVE_INFINITY;
    public static double bestOneVarX = Double.POSITIVE_INFINITY;

    public static double func(double x) {
        return 3 * Math.pow(x, 4) - 4 * Math.pow(x, 2) + 5;
    }

    public static void fitness(population x) {
        double value;
        for (int i = 0; i < popSize; i++) {
            value = func(x.decx[i]);
            if (value < bestOneVarY) {
                bestOneVarY = value;
                bestOneVarX = x.decx[i];
            }
        }
    }

}
