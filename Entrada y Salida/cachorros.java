import java.util.Scanner;

public class cachorros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int P = sc.nextInt();
        int H = sc.nextInt();

        int quedan = (C - P) % (1 + H);

        System.out.println(quedan + P);
        sc.close();
    }
    
}
