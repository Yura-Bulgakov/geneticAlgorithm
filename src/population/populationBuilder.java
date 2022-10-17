package population;

import java.util.Random;

import static population.population.*;

public class populationBuilder {

    public static void oneVarPopulation(population arg) {
        for (int i = 0; i < popSize; i++) {
            arg.decx[i] = (double) diapMin + Math.random() * (diapMax - diapMin);
        }
    }

    public static void twoVarPopulation(population arg) {
        Random r = new Random();
        Random l = new Random();
        for (int i = 0; i < popSize; i++) {
            arg.decx[i] = diapMin + r.nextDouble() * (diapMax - diapMin);
            arg.decy[i] = diapMin + l.nextDouble() * (diapMax - diapMin);
        }
    }
}
