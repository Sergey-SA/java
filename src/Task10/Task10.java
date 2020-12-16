package Task5;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] array;
        int row = 0;
        int col = 0;

        System.out.println("Введите количество строк");
        row = in.nextInt();
        System.out.println("Введите количество столбцов");
        col = in.nextInt();

        array = new int[row][col];

        System.out.println("Введите значения матрицы");

        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = in.nextInt();
            }
        }

        for (int j = 0; j < col; j++) {
            System.out.println(array[0][j] * 3);
        }
    }
}
