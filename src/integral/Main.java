package integral;

import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        new Main().run();

    }

    private void run() {
//        double a = 0;
//        double b = PI;
//        int n = 1_000_000;
//        double h = (b-a)/n;
//        System.out.println(IntStream.range(0, n)
//                .mapToDouble(i -> a + i * h)
//                .map(this::f)
//                .sum() * h);
        Random rnd = new Random();
        System.out.println(IntStream.generate(() -> rnd.nextInt(100)).limit(10000).average().getAsDouble());

    }
    double f (double x){
        return Math.sin(x);
    }
}
