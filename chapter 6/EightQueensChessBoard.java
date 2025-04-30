import java.util.Random;

public class EightQueensChessBoard {
    static final int SIZE = 8; 

    public static void main(String[] args) {
        System.out.println("Solving the Eight Queens problem with different methods!\n");

        // Step 1 Heuristic Approach  Least attackable position
        System.out.println("Solving with Heuristic Approach:");
        heuristicSolution();
        System.out.println("\n----------------------------------\n");

        // Step 2 Random Brute-Force Approach
        System.out.println("Solving with Random Brute-Force:");
        randomSolution();
        System.out.println("\n----------------------------------\n");

        // Step 3 Exhaustive Brute-Force Approach (Backtracking)
        System.out.println("Solving with Exhaustive Brute-Force:");
        exhaustiveSolution();
        System.out.println("\n----------------------------------\n");

        // Step 4 Comparing Approaches
        compareMethods();
    }

    // Heuristic Approach by Placing queens in least-attackable squares
    static void heuristicSolution() {
        int[][] board = new int[SIZE][SIZE];
        int[] queens = new int[SIZE];

        for (int row = 0; row < SIZE; row++) {
            int bestCol = getLeastAttackedColumn(board, row);
            queens[row] = bestCol;
            board[row][row] = bestCol;
        }

        printBoard(queens);
    }

    static int getLeastAttackedColumn(int[][] board, int row) {
        int bestCol = 0;
        int minAttacks = SIZE;

        for (int col = 0; col < SIZE; col++) {
            int attacks = countAttacks(board, row, col);
            if (attacks < minAttacks) {
                minAttacks = attacks;
                bestCol = col;
            }
        }
        return bestCol;
    }

    static int countAttacks(int[][] board, int row, int col) {
        int attacks = 0;
        for (int r = 0; r < row; r++) {
            int c = board[r][row];
            if (c == col || Math.abs(r - row) == Math.abs(c - col)) {
                attacks++;
            }
        }
        return attacks;
    }

    static void randomSolution() {
        Random random = new Random();
        int[] queens = new int[SIZE];
        boolean success = false;

        while (!success) {
            for (int row = 0; row < SIZE; row++) {
                queens[row] = random.nextInt(SIZE);
            }
            success = isValidBoard(queens);
        }
        printBoard(queens);
    }

    static void exhaustiveSolution() {
        int[] queens = new int[SIZE];
        if (placeQueens(queens, 0)) {
            printBoard(queens);
        } else {
            System.out.println("No solution found.");
        }
    }

    static boolean placeQueens(int[] queens, int row) {
        if (row == SIZE) return true; 

        for (int col = 0; col < SIZE; col++) {
            queens[row] = col;
            if (isValidBoard(queens) && placeQueens(queens, row + 1)) return true;
        }
        return false;
    }

    // Check if queens placement is valid
    static boolean isValidBoard(int[] queens) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = i + 1; j < SIZE; j++) {
                if (queens[i] == queens[j] || Math.abs(i - j) == Math.abs(queens[i] - queens[j])) {
                    return false; 
                }
            }
        }
        return true;
    }

    static void printBoard(int[] queens) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(queens[row] == col ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    static void compareMethods() {
        System.out.println("Comparison of Approaches:");
        System.out.println("- Heuristic Approach: Smart & faster, but not guaranteed to work.");
        System.out.println("- Random Brute-Force: Simple, but requires lots of retries.");
        System.out.println("- Exhaustive Brute-Force: Guaranteed solution, but slow for bigger problems.");
    }
}
