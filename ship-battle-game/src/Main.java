import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    private static void showTheOcean(char[][] ocean) {

        System.out.println("0 | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < ocean.length; i++) {
            System.out.print(i + 1 + " | ");
            for (int j = 0; j < ocean[i].length; j++) {
                if (ocean[i][j] != '!') {
                    System.out.print(ocean[i][j] + " | ");
                } else {
                    System.out.print("- | ");
                }
            }
            System.out.println();
        }
    }

    private static int isNumber() {

        int number = 0;
        boolean isNumber = false;

        while (!isNumber) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine();

                if (number > 5 || number < 1) {
                    System.out.println("You Entered A Number Out of Bound! Please Try Again!");
                    continue;
                }
                isNumber = true;

            } else {
                System.out.println("You did not enter a number. Try again.");
                scanner.nextLine();
            }
        }
        return number;
    }

}