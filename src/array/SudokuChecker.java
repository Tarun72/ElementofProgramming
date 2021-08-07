package array;

import java.util.HashSet;

public class SudokuChecker extends ElementsOfProgramming {


    @Override
    void onSolution() {
        /*char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };*/

        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("is valid "+isValidSudoku(board));
    }

    public static void main(String[] args) {
        new SudokuChecker().onSolution();
    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> tracker = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char dot = board[i][j];
                if(dot != '.'){
                    String column = "column" + j + " " + board[i][j];
                    String row = "row" + i + " " + board[i][j];
                    int boxNumber = (i / 3) * 3 + j / 3;
                    String box = "box" + boxNumber + " " + board[i][j];
                    if (!tracker.add(column) || !tracker.add(row)) {
                        return false;
                    }
                    if (! tracker.add(box)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    void initDetail() {
        pageNumber = 81;
        leetCodeUrl = "https://leetcode.com/problems/valid-sudoku/";
        questionNumber = 6.16F;
    }
}
