import java.util.Scanner;

public class NumPrimoK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        int contador = 0;
        int numero = 1; 

        while (contador < K) {
            numero++;
            if (esPrimo(numero)) {
                contador++;
            }
        }

        System.out.println(numero);
    }

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


