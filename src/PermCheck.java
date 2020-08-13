public class PermCheck {
    public static void main(String[] args) {

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        boolean[] X = new boolean[A.length];
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] <= A.length) {
                if (!X[A[i]-1]) {
                    X[A[i] - 1] = true;
                    cnt++;
                }
                if (cnt == A.length) return 1;
            }
        }

        return 0;
    }
}
