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
        if (emptyCell == null) {
            return true;
        }

        int r = emptyCell.y;
        int c = emptyCell.x;

        for (int d = 1; d <= 9; d++) {
            if (!grid.givesConflict(r, c, d)) {
                grid.fillCell(r, c, d);
                if (solve()) {
                    return true;
                }
                grid.fillCell(r, c, 0);
            }
        }

        // Use a recursive strategy to solve the Sudoku puzzle
        return false;
    }

    public void solveIt() {
        if (solve()) {
            grid.print();
        } else {
            System.out.println("No solution");
        }
        // Use solve() to solve the puzzle and print the solution or a message if no
        // solution is found
    }

    public static void main(String[] args) {
        SudokuGrid grid = new SudokuGrid();
        int[][] initialBoard = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                grid.fillCell(r, c, initialBoard[r][c]);
            }
        }
        SudokuSolver solver = new SudokuSolver(grid);
        solver.solveIt();
        // Create a SudokuGrid and a SudokuSolver
    }
}