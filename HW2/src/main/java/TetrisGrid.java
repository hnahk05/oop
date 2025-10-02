//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    private boolean[][] grid;

    public TetrisGrid(boolean[][] grid) {
        int width = grid.length;
        int height = grid[0].length;
        this.grid = new boolean[width][height];
        for (int x = 0; x < width; x++) {
            System.arraycopy(grid[x], 0, this.grid[x], 0, height);
        }
    }

	public void clearRows() {
        boolean[][] newGrid = new boolean[grid.length][grid[0].length];
        int newY = 0;
        for (int y = 0; y < grid[0].length; y++) {
            boolean full = true;
            for (int x = 0; x < grid.length; x++) {
                if (!grid[x][y]) {
                    full = false;
                    break;
                }
            }
            if (!full) {
                for (int x = 0; x < grid.length; x++) {
                    newGrid[x][newY] = grid[x][y];
                }
                newY++;
            }
        }
        grid = newGrid;
	}

	boolean[][] getGrid() {
        return grid;
	}
}
