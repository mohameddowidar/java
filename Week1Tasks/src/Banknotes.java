import java.util.Scanner;
public class Banknotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N < 0){
            N = 0;
        }
        int Hund = N / 100;
        int fif = (N - (Hund * 100)) / 50;
        int twen = (N - ((fif * 50) + (Hund * 100))) / 20;
        int ten = (N - ((fif * 50) + (Hund * 100) + (twen * 20))) / 10;
        int five = (N - ((fif * 50) + (Hund * 100) + (twen * 20) + (ten * 10))) / 5;
        int two = (N - ((fif * 50) + (Hund * 100) + (twen * 20) + (ten * 10) + (five * 5))) / 2;
        int one = (N - ((fif * 50) + (Hund * 100) + (twen * 20) + (ten * 10) + (five * 5) + (two * 2))) / 1;
        System.out.println(N);
        System.out.println(Hund + " nota(s) de R$ 100,00");
        System.out.println(fif + " nota(s) de R$ 50,00");
        System.out.println(twen + " nota(s) de R$ 20,00");
        System.out.println(ten + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");


    }
}