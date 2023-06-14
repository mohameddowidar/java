import java.util.Scanner;
public class HighestAndPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int pos = 0;
        for (int i = 1; i <= 100; i++) {
            int num = input.nextInt();
            if (num > max) {
                max = num;
                pos = i;
            }
        }
        System.out.println(max);
        System.out.println(pos);
    }
}