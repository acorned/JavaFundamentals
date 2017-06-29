package javase01.t03;

/**
 * Created by acorned on 02.06.17.
 */
public class Tg {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double h = Double.parseDouble(args[2]);
        System.out.println("Argument Function");
        for (double i = a; i <= b; i += h) {
            System.out.printf("%8f %8f%n", i, Math.tan(i * 2) - 3);
        }

    }
}
