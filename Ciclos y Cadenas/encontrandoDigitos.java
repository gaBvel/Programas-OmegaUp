import java.util.Scanner;

public class encontrandoDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int[] contador = new int[10];

        for (int i = 0; i < N; i++) {
            String linea = sc.nextLine();
            for (char c : linea.toCharArray()) {
                if (Character.isDigit(c)) {
                    contador[c - '0']++;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("El " + i + " aparece " + contador[i] + " veces.");
        }

        sc.close();
    }
}
