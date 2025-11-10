import java.util.Scanner;

public class ordenandoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int num [] = {A, B, C, D};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
    
}
