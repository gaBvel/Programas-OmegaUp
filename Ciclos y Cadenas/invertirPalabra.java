import java.util.Scanner;

public class invertirPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            StringBuilder resultado = new StringBuilder();

            int i = 0;
            while (i < linea.length()) {
                
                if (linea.charAt(i) == ' ') {
                    resultado.append(' ');
                    i++;
                } else {
                    
                    int inicio = i;
                    while (i < linea.length() && linea.charAt(i) != ' ') {
                        i++;
                    }
                
                    String palabra = linea.substring(inicio, i);
                    resultado.append(new StringBuilder(palabra).reverse());
                }
            }
            System.out.println(resultado.toString());
        }
        sc.close();
    }
}
