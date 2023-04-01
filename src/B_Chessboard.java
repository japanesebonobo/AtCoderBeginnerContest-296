import java.util.*;

public class B_Chessboard  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char B[][] = new char[8][8];
        for (int i = 0; i < 8; i++) {
            B[i] = scanner.next().toCharArray();
        }
        scanner.close();

        char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String ans = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (B[i][j] == '*') {
                    ans=alphabet[j]+String.valueOf(8-i);
                    break;
               }
            }
        }
        System.out.println(ans);
    }
}

