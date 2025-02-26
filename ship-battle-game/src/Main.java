import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    private static void fillTheOcean(char[][] ocean) {

        for (char[] chars : ocean) {
            Arrays.fill(chars, '-');
        }

    }

    private static void deployTheShip(char[][] ocean) {

        int x = (int) (Math.random() * 5);
        int y = (int) (Math.random() * 5);

        ocean[x][y] = '!';

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

    private static int attackTheShip(char[][] ocean, int sum) {

        System.out.println("Enter the row of your attack:");
        int x = isNumber() - 1;
        System.out.println("Enter the column of your attack:");
        int y = isNumber() - 1;

        if (ocean[x][y] == '!') {
            System.out.println("You sank a piece of ship!");
            ocean[x][y] = 'x';
            showTheOcean(ocean);
            return ++sum;
        } else if (ocean[x][y] == '*' || ocean[x][y] == 'x') {
            System.out.println("You cannot attack the same place!");
            showTheOcean(ocean);
            return sum;

        } else {
            System.out.println("You missed!");
            ocean[x][y] = '*';
            showTheOcean(ocean);
            return sum;
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