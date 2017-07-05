package javase01.t04;

/**
 * Created by acorned on 05.06.17.
 * Task is solved for array (a1, a2 … a2n), because solving for (a1, a2 … an) doesn't make sense.
 */

public class Arrs {
    public static void main(String[] args) {
        double[] sums = new double[args.length / 2];
        double max = Double.MIN_VALUE;
        for (int i = 0; i < sums.length; i++) {
            sums[i] = Double.parseDouble(args[i]) + Double.parseDouble(args[args.length - 1 - i]);
            System.out.printf("sums [%d] = %f%n", i, sums[i]);
            if (max < sums[i]) max = sums[i];
        }
        System.out.printf("Max value is %f%n", max);
    }
}
