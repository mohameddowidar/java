import java.util.Scanner;
public class EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counEven = 0;
        int counOdd = 0;
        int counPos = 0;
        int counNeg = 0;
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                counEven++;
            } else {
                counOdd++;
            }
            if (num > 0) {
                counPos++;
            } else if (num < 0){
                counNeg++;
            }

        }
        System.out.println(counEven + " valor(es) par(es)");
        System.out.println(counOdd + " valor(es) impar(es)");
        System.out.println(counPos + " valor(es) positivo(s)");
        System.out.println(counNeg + " valor(es) negativo(s)");    }
}