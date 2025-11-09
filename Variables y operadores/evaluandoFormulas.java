import java.util.Scanner;

public class evaluandoFormulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = (x + 5) / (2 * (x + 1));
        double z = ((y * y) + (x * (x - (2 * y)))) / (x * y);

        System.out.println(z);

        sc.close();
    }
    
}
