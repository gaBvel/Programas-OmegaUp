import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("equilatero");
  
        } else if (a != b && b == c) {
            System.out.println("isosceles");
            
        } else if (a == b && b != c) {
            System.out.println("isosceles");
            
        } else if (a == c) {
            System.out.println("isosceles");
            
        } else {
            System.out.println("escaleno");

        }
        sc.close();
    }
}
