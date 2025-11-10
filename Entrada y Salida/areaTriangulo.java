import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int base = 0;
        int altura = 0;

        base = sc.nextInt();
        altura = sc.nextInt();

        int area = (base * altura) / 2;

        System.out.println(area);

        sc.close();  
    }  
}