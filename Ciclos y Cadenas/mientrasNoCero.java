import java.util.Scanner;

public class mientrasNoCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int num = 1;

        while (num != 0) {
            num = sc.nextInt();
            suma += num;
        }
        System.out.println(suma);
        sc.close();
    }
}
