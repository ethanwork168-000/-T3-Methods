import java.util.Scanner;

public class DivisibleBy7 {
    public static boolean isDivisibleBy7(int num) {
        return num % 7 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("? ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (isDivisibleBy7(num)) {
                System.out.println(num + " is divisible by 7");
            } else {
                System.out.println(num + " is not divisible by 7");
            }
        }
        scanner.close();
    }
}
