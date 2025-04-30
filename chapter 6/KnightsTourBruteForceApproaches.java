import java.util.Random;

public class KnightsTourBruteForceApproaches {
    static final int SIZE = 8;
    static int[][] board;
    static int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        Random random = new Random();

        // Part a) Single Random Tour
        board = new int[SIZE][SIZE]; // Reset board
        int moves = runKnightTour(random);
        System.out.println("\nSingle Tour: Knight moved " + moves + " times.");
        displayBoard();

        // Part b) Running 1000 Tours
        int[] tourCounts = new int[SIZE * SIZE + 1];
        for (int i = 0; i < 1000; i++) {
            board = new int[SIZE][SIZE];
            moves = runKnightTour(random);
            tourCounts[moves]++;
        }
        displayTourStats(tourCounts);

        // Part c) Run until a full tour is found
        long startTime = System.currentTimeMillis();
        int attempts = 0;
        while (true) {
            board = new int[SIZE][SIZE];
            moves = runKnightTour(random);
            tourCounts[moves]++;
            attempts++;

            if (moves == SIZE * SIZE) {
                long endTime = System.currentTimeMillis();
                System.out.println("\nFull tour found after " + attempts + " attempts.");
                System.out.println("Time taken: " + (endTime - startTime) + "ms.");
                displayTourStats(tourCounts);
                break;
            }
        }

        // Part d) Discussion
        System.out.println("\nComparison: Brute-Force vs Accessibility-Heuristic");
        System.out.println("- Brute-force requires more computing power, but guarantees a full tour eventually.");
        System.out.println("- Accessibility-Heuristic optimizes knight moves, leading to faster results.");
        System.out.println("- Brute-force may run for hours without finding a full tour, but heuristic strategies improve efficiency.");
    }

    static int runKnightTour(Random random) {
        int row = random.nextInt(SIZE);
        int col = random.nextInt(SIZE);
        int moveCount = 1;
        board[row][col] = moveCount;

        while (true) {
            int move = random.nextInt(8);
            int newRow = row + rowMoves[move];
            int newCol = col + colMoves[move];

            if (isValidMove(newRow, newCol)) {
                row = newRow;
                col = newCol;
                board[row][col] = ++moveCount;
            } else {
                break;
            }
        }
        return moveCount;
    }

    static boolean isValidMove(int r, int c) {
        return r >= 0 && r < SIZE && c >= 0 && c < SIZE && board[r][c] == 0;
    }

    static void displayBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
    }

    static void displayTourStats(int[] tourCounts) {
        System.out.println("\nTour Length | Frequency");
        System.out.println("------------------------");
        for (int i = 1; i < tourCounts.length; i++) {
            if (tourCounts[i] > 0)
                System.out.printf("%10d | %5d\n", i, tourCounts[i]);
        }
    }
}
