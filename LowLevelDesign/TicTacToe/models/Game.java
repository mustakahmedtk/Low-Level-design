package TicTacToe.models;

import TicTacToe.Strategies.GameWinningStrategy.GameWinningStrategy;
import TicTacToe.Strategies.GameWinningStrategy.OrderOneGameWiningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;

    private List<Move> moves;

    private GameStatus gameStatus;

    private Player winner;

    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;

    public void makeNextMove(){
        Player toMovePlayer = players.get(nextPlayerIndex);
        System.out.println("it is" + players.get(nextPlayerIndex).getSymbol() + "'s turn");

        Move move = toMovePlayer.decideMove(this.board);

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        System.out.println("Move happened at: " +row+" , "+col);

        board.getBoard().get(row).get(col).setCellState(CellState.FILLED);
        board.getBoard().get(row).get(col).setPlayer(players.get(nextPlayerIndex));


        Move finalMove = new Move(players.get(nextPlayerIndex), board.getBoard().get(row).get(col));

        this.moves.add(finalMove);

        if(gameWinningStrategy.checkWinner(board, players.get(nextPlayerIndex), finalMove.getCell())){
            gameStatus = GameStatus.WIN;
            winner = players.get(nextPlayerIndex);
        }

        nextPlayerIndex += 1;
        nextPlayerIndex %= players.size();


    }


    private Game(){

    }

    public Board getBoard() {
        return board;
    }

    public void displayBoard() {
        this.board.display();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

   public static class Builder {
        private int dimension;
        private List<Player> players;

       public Builder setDimension(int dimension) {
           this.dimension = dimension;
           return this;
       }

       public Builder setPlayers(List<Player> players) {
           this.players = players;
           return this;
       }

       private boolean valid() throws Exception {
           if(this.dimension < 3){
               throw new Exception("dimension of Game can't be less than 3");
           }
           if(this.players.size() != this.dimension-1){
               throw new Exception("number of player must be dimesnion -1");
           }

           // check if players have same symbol
           HashSet<Character> symbolSize  = new HashSet<>();
           for(int i = 0; i<this.players.size(); i++){
               symbolSize.add(this.players.get(i).getSymbol());
           }

           if(this.players.size() != symbolSize.size()){
               throw new Exception("players have same symbol");
           }

           return true;
       }

       public Game build() throws Exception {
           try {
               valid();
           }catch(Exception e){
               throw new Exception(e.getMessage());
           }

           Game game =  new Game();
           game.setGameStatus(GameStatus.IN_PROGRESS);
           game.setPlayers(players);
           game.setPlayers(new ArrayList<>());
           game.setBoard(new Board(dimension));
           game.setNextPlayerIndex(0);
           game.setGameWinningStrategy(new OrderOneGameWiningStrategy(dimension));

           return game;
       }
   }


}
