package practice.template;

class Chess extends Game {
    private int maxTurn = 10;
    private int turn = 1;

    public Chess() {
        super(2);
    }

    @Override
    protected int getWinningPlayer() {
        return 0;
    }

    @Override
    protected boolean haveWinner() {
        return turn == maxTurn;
    }

    @Override
    protected void takeTurn() {
        System.out.println("Turn " + (turn++) + "taken by player" + currentPlayer);
        currentPlayer = (currentPlayer + 1) % numberofPlayers;
    }

    @Override
    protected void start() {
        System.out.println("Starin game o fchess");
    }
}
