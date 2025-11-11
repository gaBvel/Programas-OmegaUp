import java.util.*;

public class ULAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        List<Long> lista = new ArrayList<>();

        long actual = n;
        lista.add(actual);

        while (actual != 1) {
            if (actual % 2 == 0) {
                actual /= 2;
            } else {
                actual = actual * 3 + 1;
            }
            lista.add(actual);
        }

        Collections.sort(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i < lista.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

