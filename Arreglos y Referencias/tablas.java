import java.util.Scanner;

public class tablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   
        int[] numeros = new int[num];

        for (int i = 0; i < num; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            int N = numeros[i];

            for (int j = 1; j <= 10; j++) {
                System.out.println(N + "x" + j + "=" + (N * j));
            }

            if (i < num - 1) {
                System.out.println();
            }
        }

        sc.close();
    }
}
