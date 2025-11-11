import java.util.Scanner;

public class reverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] numeros = new int[num];

        for (int i = 0; i < num; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = num - 1; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i > 0) System.out.print(" ");
        }
        sc.close();
    }
}
