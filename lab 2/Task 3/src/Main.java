import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        long N = scanner.nextLong();
        long re = 0;
        if (N>0) {
            while (N > 0) {
                long ost = N % 10;
                re = re * 10 + ost;
                N = N / 10;
            }
            }
        else {
            System.out.print("Ошибка: N должно быть больше 0");
            return;
            }
        System.out.println("Число, прочитанное справа налево: " + re);
    }
}
