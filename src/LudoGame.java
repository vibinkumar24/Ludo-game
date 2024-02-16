import java.util.*;

public class LudoGame {

    public static void main(String[] args) {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        Player player3 = new Player("player3");
        Player player4 = new Player("player4");
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        Dice dice = new Dice();
        Board ludoBoard = new Board();
        System.out.println("Game started");
        ludoBoard.displayBoard();

        for (Player player : players) {
            player.play(dice, ludoBoard);
        }
    }
}






