import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = 3.14159;
        double R = input.nextDouble();
        double A = n * (R*R);
        System.out.println("A="+  String.format("%.4f", A));

    }
}