package practice.template;

abstract class Game {
    public Game(int numberofPlayers) {
        this.numberofPlayers = numberofPlayers;
    }

    protected int currentPlayer;
    protected final int numberofPlayers;

    public void run() {
        start();
        while (!haveWinner())
            takeTurn();
        System.out.println("Player " + getWinningPlayer() + "Wins");
    }

    protected abstract int getWinningPlayer();

    protected abstract boolean haveWinner();

    protected abstract void takeTurn();

    protected abstract void start();
}
