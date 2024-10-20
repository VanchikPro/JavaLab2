import java.util.Scanner;
public class Main {
    public static long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static double ryadTaylora(double X, int N) {
        double sum = 0;
        for (int i = 0; i <= N; i++) {
            double term = Math.pow(-1, i) * Math.pow(X, 2 * i + 1) / factorial(2 * i + 1);
            sum += term;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите X: ");
        double X = scanner.nextDouble();
        System.out.print("Введите N: ");
        int N = scanner.nextInt();
        double result = ryadTaylora(X, N);
        System.out.println("sin(X) ≈ " + result);
    }
}
