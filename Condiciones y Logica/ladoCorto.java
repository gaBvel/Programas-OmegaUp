import java.util.Scanner;

public class ladoCorto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2, x3, y3, x4, y4;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        x3 = sc.nextDouble();
        y3 = sc.nextDouble();

        x4 = sc.nextDouble();
        y4 = sc.nextDouble();

        double lado1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double lado2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double lado3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        double lado4 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));

        double menor = lado1;
        if (lado2 < menor) menor = lado2;
        if (lado3 < menor) menor = lado3;
        if (lado4 < menor) menor = lado4;

        System.out.println(menor);

        sc.close();
    }
}
