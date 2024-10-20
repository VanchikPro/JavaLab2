import java.util.Scanner;
public class Main {
    public static double Perimeter(double x1, double y1, double x2, double y2) {
        double width = Math.abs(x2 - x1);
        double height = Math.abs(y1 - y2);
        double prmtr = 2 * (width + height);
        return prmtr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите координату y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Введите координату x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите координату y2: ");
        double y2 = scanner.nextDouble();
        double result = Perimeter(x1, y1, x2, y2);
        System.out.println("Периметр прямоугольника: " + result);
    }
}
