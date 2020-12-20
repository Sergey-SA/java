package FinalTask3;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTask3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        int max = 0;
        String[] strArray;
        int[] numArray;

        System.out.println("Введите количество строк: ");
        num = in.nextInt();
        strArray = new String[num];
        numArray = new int[num];

        System.out.println("Введите строки ");
        for(int i = 0; i < num; i++) {
            strArray[i] = in.next();
        }

        for(int i = 0; i < num; i++) {
            String[] array = new String[strArray[i].length()];
            int count = 0;

            for(int j = 0; j < strArray[i].length(); j++) {
                array[j] = strArray[i].substring(j, j + 1);
            }

            Arrays.sort(array);

            for(int j = 0; j < array.length; j++) {
                String strFind = array[j];
                for(int g = j + 1; g < array.length; g++) {
                    if (strFind.equals(array[g])) {
                        array[g] = "";
                    }
                }
            }

            for(int j = 0; j < array.length; j++) {
                if(array[j].equals("")) {
                    continue;
                }

                count++;
            }

            numArray[i] = count;
        }

        for(int i = 0; i < num - 1; i++) {
            if(numArray[i] < numArray[i + 1]) {
                max = i + 1;
            }
        }
            System.out.println(strArray[max]);
    }
}
