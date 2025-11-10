import java.util.Scanner;

public class serie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Numero = sc.nextInt();
        int Posicion = sc.nextInt();

        int despues = Numero;
        int antes = Numero;

        if (Posicion == 1) {
            if (Numero == 1) {
                despues = 2;
                antes = 3;
            } else if (Numero == 2) {
                despues = 3;
                antes = 1;
            } else if (Numero == 3) {
                despues = 1;
                antes = 2;
            }
        }

        if (Posicion == 2) {
            if (Numero == 1) {
                despues = 3;
                antes = 2;
            } else if (Numero == 2) {
                despues = 1;
                antes = 3;
            } else if (Numero == 3) {
                despues = 2;
                antes = 1;
            }
        }

        if (Posicion == 3) {
            despues = Numero;
            antes = Numero;
        }

        System.out.println(antes + " " + despues);
        sc.close();

    }
}
