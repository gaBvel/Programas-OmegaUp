import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double Superficie = sc.nextDouble();

        double pi = 3.141592;
        double diametro = 2 * (Math.sqrt(Superficie / pi));
        double radio = Math.sqrt(Superficie / pi);
        double Perimetro = 2 * pi * radio;

        System.out.printf("%.2f%n", diametro);
        System.out.printf("%.2f%n", radio);
        System.out.printf("%.2f%n", Perimetro);

        sc.close();
    }
}
