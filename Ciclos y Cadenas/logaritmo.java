import java.util.Scanner;

public class logaritmo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        int resultado = 0;

        while (num > 1) {
            num = num / 2;
            resultado++;
        }

        System.out.println(resultado);
        sc.close();
    }
}
