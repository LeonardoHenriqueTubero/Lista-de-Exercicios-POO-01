package services;

public class Fatorial {
    public static int fatorial(int x) {
        if (x == 0) {
            return 1;
        }
        else {
            return x * fatorial(x - 1);
        }
    }
}
