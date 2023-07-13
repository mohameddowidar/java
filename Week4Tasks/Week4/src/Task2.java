import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        File file = new File("Lincoln.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            scan.next();
            count++;
        }
        System.out.println("Number of words : " + count);

    }
}
