import java.util.Scanner;

public class planetaLejano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg = sc.nextInt();

        int seg_minuto = 50;
        int seg_hora = 3500;
        int seg_dia = 42000;

        int dias = seg / seg_dia;
        int horas = (seg % seg_dia) / seg_hora;
        int minutos = (seg % seg_dia % seg_hora) / seg_minuto;
        int segundos = seg % seg_minuto;

        System.out.println(dias);
        System.out.println(horas);
        System.out.println(minutos);
        System.out.println(segundos);
        
        sc.close();
    }
}


