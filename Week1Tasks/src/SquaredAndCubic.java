import java.util.Scanner;
public class SquaredAndCubic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int pos = 0;
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.printf("%d %d %d", i, (i * i), (i * i * i));
            System.out.println();
        }
    }
}