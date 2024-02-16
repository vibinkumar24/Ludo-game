import java.util.Arrays;

class Board {
    public static final int BOARD_SIZE =225;
    private char[] board;

    public Board() {
        this.board = new char[BOARD_SIZE];
        Arrays.fill(board, ' ');
    }

    public void displayBoard() {
        System.out.println("Current Board:");
        for (int e=0;e<=14;e++){
            for (int f=0;f<=14;f++){
                if((e==0||e==1||e==2||e==3||e==4||e==5||e==9||e==10||e==11||e==12||e==13||e==14)&&(f==0||f==1||f==2||f==3||f==4||f==5||f==9||f==10||f==11||f==12||f==13||f==14)) {
//                    System.out.print("   ");
                    System.out.print(board[f] + "   ");
                }else {
//                    System.out.print("*  ");
                    System.out.print(board[f] + "*  ");
                }
            }
           // System.out.println();
            System.out.println(board[e]);
        }

    }
}