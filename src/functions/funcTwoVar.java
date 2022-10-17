package functions;

import population.population;

import static population.population.popSize;

public class funcTwoVar extends function {
    public static double bestTwoVarY = Double.POSITIVE_INFINITY;
    public static double bestTwoVarX = Double.POSITIVE_INFINITY;
    public static double bestTwoVarZ = Double.POSITIVE_INFINITY;

    public static double func(double x, double y) {
        return 4 * Math.exp(-Math.pow(x, 2) - Math.pow(y, 2)) + Math.sin(x + 7 * y);
    }

    public static void fitness(population x) {
        double value;
        for (int i = 0; i < popSize; i++) {
            value = 4 * func(x.decx[i], x.decy[i]);
            if (-value < bestTwoVarZ) {
                bestTwoVarZ = value;
                bestTwoVarX = x.decx[i];
                bestTwoVarY = x.decy[i];
            }
        }
    }

}
