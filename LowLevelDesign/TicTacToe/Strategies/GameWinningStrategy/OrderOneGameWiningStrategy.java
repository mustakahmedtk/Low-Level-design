package TicTacToe.Strategies.GameWinningStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderOneGameWiningStrategy implements GameWinningStrategy{

    private List<HashMap<Character, Integer>> rowSymbolCount = new ArrayList<>();
    private List<HashMap<Character, Integer>> colSymbolCount = new ArrayList<>();
    private HashMap<Character, Integer> forwardDiagonalSymbolCount = new HashMap<>();
    private HashMap<Character, Integer> reverseDiagonalSymbolCount = new HashMap<>();

    public OrderOneGameWiningStrategy(int dimension){
        for(int i = 0; i< dimension; i++){
            rowSymbolCount.add(new HashMap<>());
            colSymbolCount.add(new HashMap<>());
        }
    }

    public boolean isCellOnForwardDiagonal(int row, int col){
        return row == col;
    }

    public boolean isCellOnReverseDiagonal(int row, int col, int dimension){
        return row+col == dimension - 1;
    }
    @Override
    public boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell) {
       char symbol = lastPlayedMoveCell.getPlayer().getSymbol();
       int row = lastPlayedMoveCell.getRow();
       int col = lastPlayedMoveCell.getCol();

       int dimension  = board.getBoard().size();

       incrementCount(rowSymbolCount.get(row), symbol);
       incrementCount(colSymbolCount.get(col), symbol);

       if(isCellOnForwardDiagonal(row, col)) incrementCount(forwardDiagonalSymbolCount, symbol);
       if(isCellOnReverseDiagonal(row, col, dimension)) incrementCount(reverseDiagonalSymbolCount, symbol);


       return rowSymbolCount.get(row).get(symbol) == dimension
               || colSymbolCount.get(col).get(symbol) == dimension
               || forwardDiagonalSymbolCount.get(symbol) == dimension
               || reverseDiagonalSymbolCount.get(symbol) ==dimension;
    }


    private void incrementCount(Map<Character, Integer> countMap, char symbol){
        countMap.put(symbol, countMap.getOrDefault(symbol, 0)+1);
    }

}
