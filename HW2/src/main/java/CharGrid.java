// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

import java.util.ArrayList;
import java.util.List;

public class CharGrid {
	private char[][] grid;

	public CharGrid(char[][] grid) {
        this.grid = grid;
	}

	public int charArea(char ch) {
        int minRow = grid.length;
        int maxRow = 0;
        int minCol = grid[0].length;
        int maxCol = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == ch) {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }
        int minArea = (maxRow - minRow + 1) * (maxCol - minCol + 1);
        if (maxRow == -1) return 0;
        return minArea;
	}

    private int cross(int r, int c, int dr, int dc, char ch) {
        int len = 0;
        int i = r + dr;
        int j = c + dc;
        while (i >= 0 && i < grid.length && j >= 0 && j < grid[i].length && grid[i][j] == ch) {
            len++;
            i += dr;
            j += dc;
        }
        return len;
    }

    public int countPlus() {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                char ch = grid[i][j];
                if (ch == ' ') continue;
                int up = cross(i, j, -1, 0, ch);
                int down = cross(i, j, 1, 0, ch);
                int left = cross(i, j, 0, -1, ch);
                int right = cross(i, j, 0, 1, ch);
                if (up >= 1 && down >= 1 && left >= 1 && right >= 1 && up == down && up == left && up == right) {
                    count++;
                }
            }
        }
        return count;
    }
}
