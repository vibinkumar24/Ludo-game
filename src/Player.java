class Player {
    private String name;
    private int position;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    void play(Dice dice, Board board) {
        System.out.println(name + "'s turn");
        int roll = dice.roll();
        System.out.println("You rolled a " + roll);
        position += roll;
        if (position >= Board.BOARD_SIZE) {
            System.out.println(name + " has won!");
        } else {
            System.out.println(name + " is now at position " + position);
            board.displayBoard();
        }
    }
}

