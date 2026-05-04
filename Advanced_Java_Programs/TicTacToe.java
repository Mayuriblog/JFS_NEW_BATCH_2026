import java.util.*;

public class TicTacToe {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    static Scanner sc = new Scanner(System.in);

    // -------- PRINT BOARD --------
    static void printBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("--+---+--");
        }
    }

    // -------- CHECK WIN --------
    static boolean checkWin(char player) {

        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }

    // -------- CHECK DRAW --------
    static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        char currentPlayer = 'X';

        while (true) {
            printBoard();

            System.out.println("Player " + currentPlayer + " turn");
            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();

            System.out.print("Enter column (0-2): ");
            int col = sc.nextInt();

            // Validate move
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[row][col] = currentPlayer;

            // Check win
            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("🎉 Player " + currentPlayer + " wins!");
                break;
            }

            // Check draw
            if (isDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Switch player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}