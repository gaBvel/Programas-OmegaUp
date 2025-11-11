import java.util.*;

public class fibonacci {

    static int llamadas = 0;

    public static int fib(int n) {
        llamadas++;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        llamadas = 0;
        int resultado = fib(n);

        System.out.println(resultado + " " + llamadas);
        sc.close();
    }
}
