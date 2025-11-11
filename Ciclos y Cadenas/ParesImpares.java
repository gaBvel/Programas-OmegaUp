import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int cantidad = 0;
        int num = 0;

        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            num = sc.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println(par + " " + impar);
        sc.close();
    }
}
