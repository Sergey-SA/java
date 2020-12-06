package Task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int answer1 = in.nextInt();

        if (answer1 == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - пуд, 3 - американский фунт");
        } else {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        }

        int answer2 = in.nextInt();

        System.out.println("Введите количество выбранных единиц");
        int answer3 = in.nextInt();

        if (answer1 == 1) {
            switch (answer2) {
                case 1:
                    System.out.println("Киллограммы: " + answer3);
                    break;
                case 2:
                    System.out.println("Пуд: " + (double) (answer3 / 16.3));
                    break;
                case 3:
                    System.out.println("Американский фунты: " + (double) (answer3 * 1000 / 453.0));
                    break;
            }
        } else {
            switch (answer2) {
                case 1:
                    System.out.println("Метры: " + answer3);
                    break;
                case 2:
                    System.out.println("Мили: " + (double) (answer3 / 1609.344));
                    break;
                case 3:
                    System.out.println("Ярды: " + (double) (answer3 / 0.9144));
                    break;
                case 4:
                    System.out.println("Футы: " + (double) (answer3 / 0.3048));
                    break;
            }
        }
    }
}
