public class battleship {
    public static void main(String args[]) {
        // Create the ocean map using a single 2D array
        String[][] ocean = new String[10][10];

        // Create the numbers on the grid
        System.out.println("**** Welcome to the Battleships Game ****");
        System.out.println();
        System.out.println("Right now the sea is empty.");
        System.out.println();
        System.out.println("  0123456789  ");
        for (int row = 0; row < ocean.length; row++) {
            System.out.print(row + "|");
            for (int col = 0; col < ocean[row].length; col++) {
                if (ocean[row][col] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(ocean[row][col]);
                }
            }
            System.out.println("|" + row);
        }
        System.out.println("  0123456789  ");

    }
}
