import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        final int b = 6;
        int sum = 0;
        int c;
        for (int i = 0; i < a; i++) {
            c = scanner.nextInt();
            if (c % b == 0) {
                sum += c;
            }
        }
        System.out.println(sum);

    }
}