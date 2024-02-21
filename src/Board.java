import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Board {
    public static final int BOARD_SIZE = 225;
    private static char[] board;
    static Map<Integer,Coin> playerCoin = new HashMap<>();

    public Board() {
        this.board = new char[BOARD_SIZE];
        Arrays.fill(board, ' ');
    }

    public static void displayBoard(Dice dice, int pieceNumber) {
//        playerCoin.put(31,"01");
        System.out.println("Current Board:");
        for (int e = 0; e <= 14; e++) {
            for (int f = 0; f <= 14; f++) {
                if ((e >= 0 && e <= 5 || e >= 9 && e <= 14) &&
                        (f >= 0 && f <= 5 || f >= 9 && f <= 14)) {
                    if ((e == 3 || e == 4) && (f == 1 || f == 2)) {
                        System.out.print(" ♒ ");
                    } else if ((e == 12 || e == 13) && (f == 3 || f == 4)) {
                        System.out.print(" \uD83D\uDC2F  ");
                    } else if ((e == 10 || e == 11) && (f == 12 || f == 13)) {
                        System.out.print(" \uD83D\uDC30  ");
                    } else if ((e == 1 || e == 2) && (f == 10 || f == 11)) {
                        System.out.print(" \uD83D\uDC25 ");
                    } else {
                        System.out.print(board[e] + "   ");
                    }
                } else if (((e == 6 || e == 8) && (f >= 6 && f <= 8)) || (e == 7 && (f == 6 || f == 8))) {
                    System.out.print("    ");
                } else if ((e == 6 && f == 1) || (e == 7 && (f >= 1 && f <= 5))) {
                    System.out.print(" \uD83D\uDFE0 ");
                } else if ((e == 13 && f == 6) || (f == 7 && (e >= 9 && e <= 13))) {
                    System.out.print(" \uD83D\uDFE2 ");
                } else if ((e == 8 && f == 13) || (e == 7 && (f >= 9 && f <= 13))) {
                    System.out.print(" \uD83D\uDFE1 ");
                } else if ((e == 1 && f == 8) || (f == 7 && (e >= 1 && e <= 5))) {
                    System.out.print(" \uD83D\uDFE3 ");
                } else if (e == 7 && f == 7) {
                    System.out.print("  \uD83C\uDFF0 ");
                } else {
                    System.out.print(board[e] + " ⚫ ");
                }
            }
            System.out.println();
        }
    }

}



