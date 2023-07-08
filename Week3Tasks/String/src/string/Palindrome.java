package string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int count = str.length() - 1;
        boolean flag = true;
        for (int i = 0, j = count; i <= count / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
