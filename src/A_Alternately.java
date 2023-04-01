import java.util.*;

public class A_Alternately {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] s = new char[N];
        s = scanner.next().toCharArray();
        scanner.close();

        String ans = "Yes";

        for (int i = 0; i < N-1; i++) {
            if(s[i] == s[i+1]) {
                ans = "No";
            }
        }
        System.out.println(ans);
    }
}

