import java.util.Scanner;

public class Febrero {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if ((A % 4 == 0 && A % 100 != 0) || (A % 400 == 0)) {
            System.out.println("29");
        } else {
            System.out.println("28");
        }

        if ((B % 4 == 0 && B % 100 != 0) || (B % 400 == 0)) {
            System.out.println("29");
        } else {
            System.out.println("28");
        }

        if ((C % 4 == 0 && C % 100 != 0) || (C % 400 == 0)) {
            System.out.println("29");
        } else {
            System.out.println("28");
        }

         if ((D % 4 == 0 && D % 100 != 0) || (D % 400 == 0)) {
            System.out.println("29");
        } else {
            System.out.println("28");
        }

        sc.close();
    } 
}
