public class FrogJmp {

    public static void main(String[] args) {


    }

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
//        int start = X;
//        for (int i = 0;; i++) {
//            if(start >= Y) {
//                return i;
//            }
//            start += D;
//        }

        if(Y - X == 0) {
            return 0;
        } else {
            int distance = Y-X;

            if(distance%D == 0) return distance/D;
            else return distance/D + 1;
        }
    }
}
