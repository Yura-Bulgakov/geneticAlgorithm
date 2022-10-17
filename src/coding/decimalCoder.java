package coding;

import static population.population.*;
import static population.population.diapMin;

public class decimalCoder extends coder {

    public static double codeOneVar(byte[] value) {
        double encodedVar = diapMin;
        for (int i = 0; i < binarySize; i++) {
            encodedVar = encodedVar + (diapMax - diapMin) * 1.0 / Math.pow(2, i + 1) * value[i];
        }
        return encodedVar;
    }

}
