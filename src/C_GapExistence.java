import java.util.*;

public class C_GapExistence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long X = scanner.nextLong();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();
        
        for (int i = 0; i < N; i++) {
            long target = A[i] - X;
            if (search(A, target)) {
                System.out.print("Yes");
                System.exit(0);;
            } 
        }

        System.out.println("No");
    }

    public static Boolean search(long[] data, long target) {
		Boolean ret = false;
		long left = 0;
		long right = data.length - 1;
		while (left <= right) {
			long mid = (left + right) / 2;
			if (data[(int) mid] == target) {
				return true;
			} else if (target < data[(int) mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ret;
	}
}