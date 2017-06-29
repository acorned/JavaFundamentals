package javase01.t05;

/**
 * Created by acorned on 05.06.17.
 */
public class Matrix {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        byte[][] matrix = new byte[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.printf("%n");
        }

    }
}
