import java.util.Scanner;

public class pitagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double catA = sc.nextDouble();
        double catB = sc.nextDouble();

        double C = Math.sqrt((catA * catA) + (catB * catB));

        System.out.printf( "%.3f%n", C);

        sc.close();
    }
}
