import edu.princeton.cs.algs4.*;

public class RandomWalkFix {
    public static void main(String[] args) {
        //int n = Integer.parseInt(args[0]);
        int n = 20;
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int len = 1, dirIndex = 0, repeat = 0;
        int steps = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        while (Math.abs(x) < n && Math.abs(y) < n) {
            for (int i = 0; i < len; ++i) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(x, y, 0.45);
                x += dx[dirIndex % 4];
                y += dy[dirIndex % 4];
                steps++;
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);
            }
            dirIndex = (dirIndex + 1) % 4;
            repeat++;
            if (repeat == 2) {
                repeat = 0;
                len++;
            }
        }
        StdOut.println("Total steps = " + steps);
    }

}
