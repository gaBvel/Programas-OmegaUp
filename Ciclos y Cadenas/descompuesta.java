import java.util.Scanner;

public class descompuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();

        texto = texto.toLowerCase();

        String resultado = "";
        boolean mayuscula = true;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (mayuscula && Character.isLetter(c)) {
                resultado += Character.toUpperCase(c);
                mayuscula = false;
            } else {
                resultado += c;
            }

            if (c == '.') {
                mayuscula = true;
            }
        }
        System.out.println(resultado);
        sc.close();
    }
}
