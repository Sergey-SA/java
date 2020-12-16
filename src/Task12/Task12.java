package Task5;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if(str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
        }

        str = str.replace('a', 'o');
        System.out.println(str.substring(7, 11));
    }
}
