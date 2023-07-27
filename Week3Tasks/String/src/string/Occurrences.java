package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        StringTokenizer st = new StringTokenizer("Hi, my name is mohamed");
        int count = 0;
        while (st.hasMoreTokens()) {
            if (st.nextToken().equals(word))
            count++;
        }
        System.out.println(count);
    }
}
