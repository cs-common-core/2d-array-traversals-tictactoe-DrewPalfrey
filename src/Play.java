import java.util.Scanner;
public class Play {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1 is X, Player 2 is O");
        System.out.println("Enter the row and column to play");
        TicTacToe game = new TicTacToe();
        while(!game.isGameOver()) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if(col <= 3 && row <= 3)
                game.play(row - 1, col - 1);
            game.printBoard();
        }
        scanner.close();
    }
}
