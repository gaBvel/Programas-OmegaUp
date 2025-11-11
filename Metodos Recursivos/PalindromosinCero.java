import java.util.Scanner;

public class PalindromosinCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        System.out.println(countValid(N));
    }

    private static long countValid(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;

        int half = (n + 1) / 2;

        long dp0 = 1; 
        long dp1 = 1; 

        for (int i = 2; i <= half; i++) {
            long newDp0 = dp1;        
            long newDp1 = dp0 + dp1;  
            dp0 = newDp0;
            dp1 = newDp1;
        }

        long totalHalf = dp0 + dp1;

    
        if (n % 2 == 0) return totalHalf;

        return totalHalf;
    }
}
