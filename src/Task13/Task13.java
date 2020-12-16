package Task5;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        boolean isEnglish;

        String[] array = str.split(" ");

        for(String s : array) {
            isEnglish = true;
            for(int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) >= 97 && s.charAt(i) <= 122 || s.charAt(i) >= 65 && s.charAt(i) <= 90)) {
                    isEnglish = false;
                    break;
                }
            }

            if(isEnglish) {
                System.out.println(s);
                count++;
            }
        }

        System.out.println(count);
    }
}
