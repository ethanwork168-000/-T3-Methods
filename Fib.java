import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("? ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 1) {
                int a = 1, b = 1;
                for (int i = 1; i <= n; i++) {
                    System.out.print(a);
                    if (i < n) {
                        System.out.print(", ");
                    }
                    int next = a + b;
                    a = b;
                    b = next;
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
