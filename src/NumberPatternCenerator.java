import java.util.Scanner;

public class NumberPatternCenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the pattern (number of rows): ");
        int rows = scanner.nextInt();

        System.out.println("Choose the pattern type:");
        System.out.println("1 -> Right Triangle");
        System.out.println("2 -> Inverted Right Triangle");
        System.out.println("3 -> Pyramid");
        System.out.println("4 -> Inverted Pyramid");
        System.out.println("5 -> Number Pattern (Floyd's Triangle)");
        System.out.print("Enter choice (1-5): ");
        int choice = scanner.nextInt();

        System.out.println();

        switch (choice) {
            case 1:

                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 2:

                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 3:

                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= (2 * i) - 1; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 4:

                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= (2 * i) - 1; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 5:
                // Number Pattern (Counts up continuously)
                int counter = 1;
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(counter + " ");
                        counter++;
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice. Please run the program again and select 1-5.");
        }

        scanner.close();
    }
}