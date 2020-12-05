package Task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        String symb = in.next();

        switch (symb){
            case "+" : System.out.println(num1 + num2);
                break;

            case "-" : System.out.println(num1 - num2);
                break;

            case "*" : System.out.println(num1 * num2);
                break;

            case "/" : System.out.println(num1 / num2);
                break;
        }



    }
}
