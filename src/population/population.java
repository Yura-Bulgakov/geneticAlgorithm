package population;

public class population {
    public static final int binarySize = 12;
    public static int popSize;
    public static int diapMin;
    public static int diapMax;
    public static int[] parentOne = new int[(int) Math.ceil(popSize * 1.0 / 2)];
    public static int[] parentTwo = new int[(int) Math.ceil(popSize * 1.0 / 2)];


    public double[] decx = new double[popSize];
    public byte[][] binx = new byte[popSize][binarySize];
    public double[] decy = new double[popSize];
    public byte[][] biny = new byte[popSize][binarySize];
}
