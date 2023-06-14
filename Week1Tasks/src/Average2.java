import java.util.Scanner;
public class Average2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = 3.14159;
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        A = A * 2;
        B = B * 3;
        C = C * 5;
        double MEDIA = (A + B + C) / (2 + 3 + 5);
        System.out.printf("MEDIA = %.1f%n", MEDIA);

    }
}