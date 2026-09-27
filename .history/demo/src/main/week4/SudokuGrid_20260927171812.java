package week4;

import java.awt.Point;

/**
 * SudokuGrid representation and helper methods.
 * 
 * TODO 4: Fill in your names and student IDs:
 * 
 * @author Jose Andre Youssef Lopes
 * @id 2433753
 * @author Victor Vassilev Dichev
 * @id 2456486
 **/

public class SudokuGrid {
    private static final int SIZE = 9;
    private static final int DIGIT_RANGE = 9;

    private int[][] grid;
    private int rEmpty, cEmpty; // Coordinates of the last found empty cell

    public SudokuGrid() {
        grid = new int[SIZE][SIZE];
        rEmpty = 0;
        cEmpty = 0;
        // Initialize the grid and set rEmpty and cEmpty to -1
    }

    public SudokuGrid copy() {
        SudokuGrid copyGrid = new SudokuGrid();

        copyGrid.grid = this.grid;
        // Create a copy of the SudokuGrid and return it
        return copyGrid;
    }

    public Point findEmptyCell() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (grid[r][c] == 0) {
                    return new Point(c, r);
                }
            }
        }
        // Find the next empty cell in reading order and return its coordinates as a
        // Point
        return null;
    }

    public void print() {
        for (int r = 0; r < SIZE; r++) {
            if (r % 3 == 0) {
                System.out.println("+-----------------+");
            }
            for (int c = 0; c < SIZE; c++) {
                if (c % 3 == 0) {
                    System.out.print("|");
                }
                if (grid[r][c] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.println(grid[r]);
                }

            }
            System.out.println();
        }
        System.out.println("+-----------------+");
        // Print the Sudoku grid
    }

    public void fillCell(int r, int c, int d) {
        grid[r][c] = d;
        // Fill the cell at row r and column c
    }

    public boolean givesConflict(int r, int c, int d) {

        // Check if filling the number d in the cell at row r and column c causes a
        // conflict
        return rowConflict(r, d) || colConflict(c, d) || boxConflict(r, c, d);
    }

    private boolean rowConflict(int r, int d) {
        for (int c = 0; c < SIZE; c++) {
            if (grid[r][c] == d) {
                return true;
            }
        }
        // Check if there is a conflict in the row r when filling the number d
        return false;
    }

    private boolean colConflict(int c, int d) {
        for (int r = 0; r < SIZE; r++) {
            if (grid[r][c] == d) {
                return true;
            }
        }
        // Check if there is a conflict in the column c when filling the number d
        return false;
    }

    private boolean boxConflict(int r, int c, int d) {
        int startRow = (r / 3) * 3;
        int startCol = (c / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[startRow + i][startCol + j] == d) {
                    return true;
                }
            }
        }
        // Check if there is a conflict in the 3x3 box containing the cell at row r and
        // column c
        // when filling the number d
        return false;
    }
}