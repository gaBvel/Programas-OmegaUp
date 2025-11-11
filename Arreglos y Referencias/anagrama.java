import java.util.Scanner;

public class anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int[] conteo = new int[26];

        for (int i = 0; i < A.length(); i++) {
            conteo[A.charAt(i) - 'a']++;
            conteo[B.charAt(i) - 'a']--;
        }

        boolean esAnagrama = true;
        for (int n : conteo) {
            if (n != 0) {
                esAnagrama = false;
                break;
            }
        }

        if (esAnagrama) {
            System.out.println("SI son anagramas");
        } else {
            System.out.println("NO son anagramas");
        }

        sc.close();
    }
}
