import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        double N = scanner.nextDouble(); // не понял нужно было вводить с клавиатуры или можно было задать значение
        double sum = 0;
        for (double i = N; i <= 2 * N; i++) {
            sum += i * i;
        }
        System.out.println("Сумма ряда: " + sum);
    }
}
