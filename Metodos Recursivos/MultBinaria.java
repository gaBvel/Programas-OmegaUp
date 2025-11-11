import java.util.Scanner;

public class MultBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b1 = sc.nextLine().trim();
        String b2 = sc.nextLine().trim();
        sc.close();

        
        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);

        int result = n1 * n2;

        String binResult = Integer.toBinaryString(result);

        System.out.println(binResult);
    }
}

