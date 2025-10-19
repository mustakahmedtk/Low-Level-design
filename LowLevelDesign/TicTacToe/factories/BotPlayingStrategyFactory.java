package TicTacToe.factories;

import TicTacToe.Strategies.botPlayingStrategy.BotPlayingStrategy;
import TicTacToe.Strategies.botPlayingStrategy.RandomBotPlayingStrategy;
import TicTacToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        return new RandomBotPlayingStrategy();
    }
}
