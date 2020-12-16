package Task5;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] array = new double[in.nextInt()];
        double aver = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }

        for(double num : array) {
            aver += num;
        }

        aver = aver / array.length;

        for(double num : array) {
            System.out.println(num * aver);
        }
    }
}
