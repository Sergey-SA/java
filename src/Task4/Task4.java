package Task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        double average = (num1 + num2 + num3) / 3.0;

        System.out.println(average);

        if((int)(average / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }


    }

}
