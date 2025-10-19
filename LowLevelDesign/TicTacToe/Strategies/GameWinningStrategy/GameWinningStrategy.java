package TicTacToe.Strategies.GameWinningStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Player;

public interface GameWinningStrategy {
  boolean  checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell);

}
