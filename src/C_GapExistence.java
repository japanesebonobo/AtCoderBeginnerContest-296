import java.util.*;

public class C_GapExistence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long X = scanner.nextLong();
        TreeSet<Long> A = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextLong());
        }
        scanner.close();

        for (Iterator<Long> iterator = A.iterator(); iterator.hasNext();) {
            long target = iterator.next() - X;
            if (A.contains(target)) {
                System.out.println("Yes");
                System.exit(0);
            } 
        }
        System.out.println("No");
    }
}