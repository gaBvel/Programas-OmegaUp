import java.util.Scanner;

public class decimalBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N < 0 || N > 500) {
            System.out.println("Error");
            return;
        }

        String bin = Integer.toBinaryString(N);

        for (int i = 0; i < bin.length(); i++) {
            System.out.println(bin.charAt(i));
        }
    }
}

