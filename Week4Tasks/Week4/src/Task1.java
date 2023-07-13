import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Enter first number");
                int num1 = input.nextInt();
                System.out.println("Enter second number");
                int num2 = input.nextInt();
                System.out.println("sum = " + (num1 + num2));
                break;
            }catch (InputMismatchException e){
                System.out.println("please, Enter Integer number");
                input.nextLine();
            }
        }
    }

}
