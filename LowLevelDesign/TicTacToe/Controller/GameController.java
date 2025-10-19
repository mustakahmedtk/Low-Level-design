package TicTacToe.Controller;

import TicTacToe.models.Game;
import TicTacToe.models.GameStatus;
import TicTacToe.models.Player;

import java.util.List;

public class GameController {

    public Game createGame(int dimension , List<Player> players){
        try {
           return Game.getBuilder().setDimension(dimension).setPlayers(players).build();
        }catch(Exception e){
            System.out.println("❌ Failed to create game: " + e.getMessage());
            e.printStackTrace(); // shows where the error really occurred
            return null;
        }
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public GameStatus gameStatus(Game game){
        return game.getGameStatus();
    }

    public void executeNextMove(Game game){
        game.makeNextMove();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public void undo(Game game) {
    }
}
