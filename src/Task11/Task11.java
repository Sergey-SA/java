package Task5;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = Integer.toString(in.nextInt());
        int num = in.nextInt();

        System.out.println(Math.max(Integer.parseInt(str), num));
        System.out.println((double)Math.min(Integer.parseInt(str), num));

    }
}
