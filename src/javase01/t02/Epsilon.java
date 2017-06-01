public class Epsilon {
    public static void main(String[] args){
        long i = 1;
        double a, E = Double.parseDouble(args[0]);
        System.out.format("E = %.4f%n", E);
        do {
            a = 1/Math.pow(i + 1, 2);
            System.out.format("a[%d] = %.4f, %n", i, a);
            i++;
        }
            while (a >= E);
        System.out.format("искомый номер последовательности: %d.%n", i - 1);
    }
}