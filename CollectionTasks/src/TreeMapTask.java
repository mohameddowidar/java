import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Character, String> map = new TreeMap<Character, String>();
        char key;
        String value;
        showMenu();
        System.err.println("\nChoose from the list ");
        while (true) {
            char x = input.next().charAt(0);
            switch (x) {
                case 'a':
                    System.out.println("Enter the key : ");
                    key = input.next().charAt(0);
                    System.out.println("Enter the value : ");
                    value = input.next();
                    if (value.charAt(0) != key){
                        System.err.println("the first letter of words not match wih key, try again");
                        break;
                    }
                     else if (map.containsKey(key)){
                        System.err.println("duplicated key, try different key");
                        break;
                    } else {
                        map.put(key, value);
                        System.out.println("Added successfully......... ");
                        break;
                    }

                case 'b':
                    printAllWordsWithCorrespondingKeys(map);
                    break;
                case 'c':
                    System.out.println("enter the ket to get the value : ");
                    key = input.next().charAt(0);
                    printWordsWithGivenKey(map, key);
                    break;
            case 'd':
                return;
                default:
                    System.out.println("please choose from a to c ");
                    break;
            }
        showMenu();
    }

}

    public static void showMenu() {
        System.out.println(
                "a- add an entry with key x and value y to the TreeMap.\n" +
                        "b-print all letters and corresponding words.\n" +
                        "c-print words of given letter.\n" +
                        "d-exit");


    }

    public static void printAllWordsWithCorrespondingKeys(TreeMap<Character, String> map) {
        if (map.isEmpty()) {
            System.err.println("the map is empty");
        } else {
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
        }

    }

    public static void printWordsWithGivenKey(TreeMap<Character, String> map, char key) {
        if (map.containsKey(key)) {
            System.out.println("The Value is: " + map.get(key));
        } else {
            System.err.println("The key not found");
        }
    }
}