public class StdGaussian {
    public static void main(String[] args){
        double u;
        do {
            u = Math.random();
        } while (u == 0);
        double v = Math.random();
        double z = Math.sin(2*Math.PI*v)*Math.sqrt((-2)*Math.log(u));
        System.out.println(z);
    }
}
