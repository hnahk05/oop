public class FivePerLine {
    public static void main(String[] args){
        for(int i = 1000; i < 2001; ++i){
            if(i != 1000 && i % 5 ==0 ) System.out.print("\n");
            System.out.print(i + " ");
        }
    }
}
