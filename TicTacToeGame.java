import java.util.Scanner;
public class TicTacToeGame {
    static char[][] gameBoard = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}};
    static char current_player;

    void display_Game_Board(){
        System.out.println("-------------");
        for (int r = 0; r < 3; r++) {
            System.out.print("| ");
            for (int c = 0; c < 3; c++) {
                System.out.print(gameBoard[r][c] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    public boolean check_Move(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Invalid move. Wrong input.");
            return false;
        }

        if (gameBoard[row][col] != ' ') {
            System.out.println("Invalid move. Cell already occupied.");
            
            return false;
        }

        return true;
    }

    public boolean check_Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameBoard[i][j] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

    void change_player(char player){
        if (player=='X') {
            current_player='O';
        }
        else{
            current_player='X';
        }
    }

    int check_Win(){
        for(int r=0;r<=2;r++){
            if (gameBoard[r][0]==gameBoard[r][1] && gameBoard[r][1]==gameBoard[r][2]) {
                if (gameBoard[r][0]=='X') {
                    return 10;
                }
                if(gameBoard[r][0]=='O'){
                    return -10;
                }
            }
        }

        for(int c=0;c<=2;c++){
            if(gameBoard[0][c]==gameBoard[1][c] && gameBoard[1][c]==gameBoard[2][c]){
                if(gameBoard[0][c]=='X'){
                    return 10;
                }
                if(gameBoard[0][c]=='O'){
                    return -10;
                }
            }
        }

        if(gameBoard[0][0]==gameBoard[1][1] && gameBoard[1][1]==gameBoard[2][2]){
            if (gameBoard[1][1]=='X') {
                return 10;
            }
            if(gameBoard[0][0]=='O'){
                    return -10;
                }
        }

        if(gameBoard[0][2]==gameBoard[1][1] && gameBoard[1][1]==gameBoard[2][0]){
            if (gameBoard[0][2]=='X') {
                return 10;
            }
            if(gameBoard[0][2]=='O'){
                    return -10;
            }
        }
        return 0;
    }

    static void newGame(){
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                gameBoard[r][c]='_';
            }
        }
        main(null);
    }

    public static void main(String[] args) {
         
        int row,column;

        System.out.println("It's a Two player game.\nWho is the First Player(X or O): ");
        Scanner scanner=new Scanner(System.in);
        char current_player_upper=scanner.next().charAt(0);
        current_player=Character.toUpperCase(current_player_upper);
        TicTacToeGame ticTacToeGame=new TicTacToeGame();
        ticTacToeGame.display_Game_Board();

        while(ticTacToeGame.check_Board()){
            System.out.println(current_player+" Turn :");
            System.out.println("Enter your position:");
            row=scanner.nextInt();
            column=scanner.nextInt();

            if(ticTacToeGame.check_Move(row,column)){
                gameBoard[row][column]=current_player;
                ticTacToeGame.display_Game_Board();
            }
            
            ticTacToeGame.change_player(current_player);
            
            if(ticTacToeGame.check_Win()==10){
                System.out.println("Player X is Winner.");
                System.out.println("Wants to Play again. Press y : ");
                char ch=scanner.next().charAt(0);
                if(ch=='y'){
                    newGame();
                }
                return;
            }

            if(ticTacToeGame.check_Win()==-10){
                System.out.println("Player O is Winner.");
                System.out.println("Wants to Play again. Press y : ");
                char ch=scanner.next().charAt(0);
                if(ch=='y'){
                    newGame();
                }
                return;
            } 
        }

        if(ticTacToeGame.check_Board()==false){
            System.out.println("Game Over!");
            System.out.println("Wants to Play again. Press y : ");
                char ch=scanner.next().charAt(0);
                if(ch=='y'){
                    newGame();
                }
        }
    }
    
}
