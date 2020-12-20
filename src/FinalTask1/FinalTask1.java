package FinalTask1;

import java.util.Scanner;

public class FinalTask1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double cours;
        int rub;

        System.out.println("Введите курс долара: ");
        cours = in.nextDouble();

        System.out.println("Введите колличество рублей: ");
        rub = in.nextInt();

        System.out.printf("Итого: %.2f долларов", (rub / cours));


    }
}
