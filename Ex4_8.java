import java.util.Scanner;

public class Ex4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите в градусах Фаренгейта: ");
    double fahrenheit = scanner.nextDouble();

    double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " градусов по Фаренгейту равно " + celsius + " градусам по Цельсию.");
    }
}