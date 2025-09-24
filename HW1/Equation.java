import java.util.Scanner;

public class Equation {
    public static int gcdIterative(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean[][] a = new boolean[n][n];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                if((i+1) != (j+1) && gcdIterative(i+1, j+1) == 1) a[i][j] = true;
                else a[i][j] = false;
            }
        }
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        scan.close();
    }
}
