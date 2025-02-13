public class Chess {
    private int turn;
    private String[][] board;

    public Chess(){
        turn = 0;
        board = new String[8][8];
        for(int i = 0; i < 8; i++){
            board[2][i] = "whitepawn";
            board[7][i] = "blackpawn";
        }
        board[8][1] = "blackrook";
        board[8][8] = "blackrook";
        board[1][1] = "whiterook";
        board[1][8] = "whiterook";

        board[8][2] = "blackknight";
        board[8][7] = "blackknight";
        board[1][2] = "whitenight";
        board[1][7] = "whiteknight";

        board[8][3] = "blackbishop";
        board[8][6] = "blackbishop";
        board[1][3] = "whitebishop";
        board[1][6] = "whitebishop";

        board[8][4] = "blackqueen";
        board[8][5] = "blackking";
        board[1][4] = "whitequeen";
        board[1][5] = "whiteking";
    }
    public String[][] play(String piece, char col, int row){
        return board;
    }
}
