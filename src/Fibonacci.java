public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i < n; i++) {
            System.out.println(fibo(i));
        }
    }

    public static int fibo(int num){
        if(num <= 1) return num;
        return fibo(num-1) + fibo(num -2);
    }

}
