import java.util.Scanner;

public class IdealAgeOfWife {
    public static double ageOfWife(double manAge) {
        return manAge / 2.0 + 7.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of a man: ");
        if (scanner.hasNextDouble()) {
            double age = scanner.nextDouble();
            double idealAge = ageOfWife(age);
            System.out.println("The ideal age of his wife is " + idealAge + ".");
        }
        scanner.close();
    }
}
