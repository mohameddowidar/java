import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Test Cases you want : ");

        int numTest = input.nextInt();

        for (int i = 1; i <= numTest; i++) {
            LinkedHashSet<Integer> s = new LinkedHashSet<>();
            System.out.println("count number of queries you want for Test Case Number " + i + " : ");
            showMenu();
            int numQueries = input.nextInt();
            for (int j = 0; j < numQueries; j++) {
                showMenu();
                System.err.println("\nChoose from the list ");
                char x = input.next().charAt(0);
                int num;
                switch (x) {
                    case 'a':
                        System.out.println("Enter the element : ");
                        num = input.nextInt();
                        s.add(num);
                        break;
                    case 'b':
                        for (Integer in : s) {
                            System.out.println(in);
                        }
                        break;
                    case 'c':
                        System.out.println("Enter element to erase :");
                        num = input.nextInt();
                        s.remove(num);
                        break;
                    case 'd':
                        System.out.println("Enter the element to check if is found : ");
                        num = input.nextInt();
                        if (s.contains(num)) {
                            System.out.println("found");
                        } else {
                            System.out.println("not found");
                        }
                        break;
                    case 'e':
                        System.out.println("number of elements : " + s.size());
                        break;
                    case 'f':
                        Iterator<Integer> it = s.iterator();
                        while (it.hasNext()) {
                            System.out.println(it.next());
                        }
                        break;
                }

            }
        }
    }


    public static void showMenu() {
        System.out.println(
                "a- insert an element x to the set s.\n" +
                        "b- print the content of the set s in increasing order.\n" +
                        "c- erases an element x from the set s.\n" +
                        "d- check if the element x is present in the set.\n" +
                        "e- print the size of the set s.\n");
    }
}
