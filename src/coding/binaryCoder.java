package coding;

import static population.population.*;

public class binaryCoder extends coder {

    public static byte[] codeOneVar(double value) {
        byte[] codedVar = new byte[binarySize];
        for (int i = 0; i < binarySize; i++) {
            if (value >= (diapMin) + (diapMax - diapMin) * 1.0 / Math.pow(2, i + 1)) {
                codedVar[i] = 1; //левый бит =1
                value = value - (diapMax - diapMin) * 1.0 / Math.pow(2, i + 1);
            } else codedVar[i] = 0;
        }

        return codedVar;
    }
}
