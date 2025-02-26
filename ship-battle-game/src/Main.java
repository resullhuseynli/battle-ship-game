public class Main {
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

}