package Task5;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] array = new int[in.nextInt()];
        int x = 1, y = 2, z = 3;

        for(int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for(int i : array) {
            if(i == x || i == y || i == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
