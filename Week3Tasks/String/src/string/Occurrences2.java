package string;

import java.util.Scanner;

public class Occurrences2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String word = input.next();
        String str = "Hi how are you welcome to java";
        String words[] = str.split(" ");
        for(String x : words) {
            if (x.equals(word)) {
                count++;
            }
        }

        System.out.println(count);


        }
}
