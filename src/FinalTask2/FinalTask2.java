package FinalTask2;

import java.util.Scanner;

public class FinalTask2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = 0;
        String str;
        String[] array = new String[5];
        int simbol = 0;

        System.out.println("Введите уровнение: ");
        str = in.nextLine();

        for(int i = 0; i < 5; i++) {
            array[i] = str.substring(i, i + 1);
        }

        for(int i = 0; i < 5; i++) {
            if(array[i].equals("x")) {
                simbol = i;
            }
        }

        if(array[1].equals("+")) {
            switch(simbol) {
                case(0) :
                    x = Integer.parseInt(array[4]) - Integer.parseInt(array[2]);
                    break;
                case(2) :
                    x = Integer.parseInt(array[4]) - Integer.parseInt(array[0]);
                    break;
                case(4) :
                    x = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);
                    break;
            }
        } else {
            switch(simbol) {
                case(0) :
                    x = Integer.parseInt(array[4]) + Integer.parseInt(array[2]);
                    break;
                case(2) :
                    x = Integer.parseInt(array[0]) - Integer.parseInt(array[4]);
                    break;
                case(4) :
                    x = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
                    break;
            }
        }

            System.out.println(x);
    }
}
