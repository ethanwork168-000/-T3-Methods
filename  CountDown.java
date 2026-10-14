import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.util.Scanner(System.in));
        System.out.print("? ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            for (int i = num; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
