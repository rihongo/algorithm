import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {2,1};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return i + 1;
            }
        }

        return A.length + 1;
    }
}
