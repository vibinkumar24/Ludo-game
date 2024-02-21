import java.util.Scanner;

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    void play(Dice dice, Board board) {
        System.out.println(name + "'s turn");
        int roll = dice.roll();
        System.out.println("You rolled a " + roll);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Choose a piece to move (1-4): ");
        int pieceNumber = scanner1.nextInt();
        Board.displayBoard(dice,pieceNumber );

        }

    }
