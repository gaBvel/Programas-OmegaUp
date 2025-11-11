import java.util.Scanner;

public class Abacaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        String result = generateABACABA(N);
        System.out.println(result);
    }

    private static String generateABACABA(int n) {
        String s = "A";

        for (int i = 2; i <= n; i++) {
            char c = (char) ('A' + i - 1);
            s = s + c + s;
        }

        return s;
    }
}
