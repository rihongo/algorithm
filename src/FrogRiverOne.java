public class FrogRiverOne {

    public static void main(String[] args) {
        int[] A = {1};
        solution(1,A);
    }

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        int[] check = new int[X];
        int checkCount = 0;
        int result = -1;

        for(int i=0;i<A.length;i++){
            if(A[i] <= X) {
                if (check[A[i] - 1] == 0) checkCount++;
                if (checkCount == X) {
                    result = i;
                    break;
                }
                check[A[i] - 1] = 1;
            }
        }

        return result;
    }
}
