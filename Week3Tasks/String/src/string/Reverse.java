 package string;

 import java.util.Scanner;

 public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int count = str.length() - 1;
        for (int i = count; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
