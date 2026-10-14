import java.util.Scanner;

public class RightAngleTriangle {
    public static boolean isRightAngle(double a, double b, double c) {
        double max = Math.max(a, Math.max(b, c));
        if (max == a) {
            return Math.abs((b * b + c * c) - (a * a)) < 0.0001;
        } else if (max == b) {
            return Math.abs((a * a + c * c) - (b * b)) < 0.0001;
        } else {
            return Math.abs((a * a + b * b) - (c * c)) < 0.0001;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle:");
        System.out.print("Side a: ");
        double a = scanner.nextDouble();
        System.out.print("Side b: ");
        double b = scanner.nextDouble();
        System.out.print("Side c: ");
        double c = scanner.nextDouble();

        if (isRightAngle(a, b, c)) {
            System.out.println("The triangle is a right-angle triangle.");
        } else {
            System.out.println("The triangle is not a right-angle triangle.");
        }
        scanner.close();
    }
}
