package Task5;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int result = 0;

        for(int i = 1; i < x; i += 2) {
            result += i;
        }
    }
}
