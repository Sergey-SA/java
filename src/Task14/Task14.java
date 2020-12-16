package Task5;

import java.util.Arrays;
import java.util.Random;


public class Task14 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[15];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40) - 20;
        }

        Arrays.sort(array);

        System.out.println(array[0]);
        System.out.println(array[14]);

        if(Math.abs(array[0]) > array[14]) {
            System.out.println(array[0]);
        } else{
            System.out.println(array[14]);
        }
    }
}
