package FinalTask4;

import java.util.Scanner;

public class FinalTask4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int attempt = 0;
        String str;

        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Введите ответ, у Вас есть 3 попытки или введите слово \"Подсказка\" - но попытка в этом случае будет только 1 ");

        for (int i = 0; i < 3; i++) {
            str = in.nextLine();

            if (str.equals("Подсказка")) {
                System.out.println("Неприятный virus in rar");
                str = in.nextLine();
                if (str.equals("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }

                break;
            }

            if (str.equals("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            } else if (attempt < 2) {
                System.out.println("Подумай еще!");
                attempt++;
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        }


    }
}
