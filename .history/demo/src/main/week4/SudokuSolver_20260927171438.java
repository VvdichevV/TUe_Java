package week4;
import java.awt.Point;

/**
 * SudokuSolver using recursive backtracking.
 * 
 * TODO 4: Fill in your names and student IDs:
 * 
 * @author Jose Andre Youssef Lopes
 * @id 2433753
 * @author Victor Vassilev Dichev
 * @id 2456486
 **/
public class SudokuSolver {
    private SudokuGrid grid;

    public SudokuSolver(SudokuGrid grid) {
        this.grid = grid;
        // Initialize the SudokuSolver with the provided SudokuGrid
    }

    public boolean solve() {
        Point emptyCell = grid.findEmptyCell();

        // Use a recursive strategy to solve the Sudoku puzzle
        return false;
    }

    public void solveIt() {
        // Use solve() to solve the puzzle and print the solution or a message if no
        // solution is found
    }

    public static void main(String[] args) {
        SudokuGrid grid = new SudokuGrid();
        int[][] initialBoard = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                grid.fillCell(r, c, initialBoard[r][c]);
            }
        }
        SudokuSolver solver = new SudokuSolver(grid);

        // Create a SudokuGrid and a SudokuSolver
    }
}