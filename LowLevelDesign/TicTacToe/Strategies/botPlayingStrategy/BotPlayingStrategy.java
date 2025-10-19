package TicTacToe.Strategies.botPlayingStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Player;

public interface BotPlayingStrategy {

    Move decideMove(Player player, Board board);

}
