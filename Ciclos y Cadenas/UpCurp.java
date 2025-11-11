import java.util.Scanner;

public class UpCurp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = sc.next();
        String apellidoP = sc.next();
        String apellidoM = sc.next();

        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();

        char primeraLetra = apellidoP.charAt(0);

        char vocal = 'X';
        for (int i = 1; i < apellidoP.length(); i++) {
            char c = apellidoP.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vocal = c;
                break;
            }
        }

        char letraApellidoM = apellidoM.charAt(0);
        char letraNombre = nombre.charAt(0);

        int anio2 = anio % 100;
        String fecha = String.format("%02d%02d%02d", anio2, mes, dia);

        String curp10 = "" + primeraLetra + vocal + letraApellidoM + letraNombre + fecha;

        System.out.println(curp10);

        sc.close();
    }
}
