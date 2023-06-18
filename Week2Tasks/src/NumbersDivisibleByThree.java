public class NumbersDivisibleByThree {
    public static void main(String[] args) {
        printNumbersDivisibleByThree();
    }

    private static void printNumbersDivisibleByThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
