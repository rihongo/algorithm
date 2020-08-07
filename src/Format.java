import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        //logic
        int answer = first + second;

        //output
        System.out.println(answer);
    }
}
