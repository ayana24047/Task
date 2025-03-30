import java.util.Scanner;

/**
 * Класс TaskTen для вычисления НОД (GCD) двух чисел с использованием рекурсии (алгоритм Евклида).
 */
public class TaskTen {
    /**
     * Метод рекурсивно вычисляет наибольший общий делитель (НОД) двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return НОД(a, b)
     *
     * Временная сложность: O(log(min(a, b))) - логарифмическая сложность.
     * Пространственная сложность: O(log(min(a, b))) - глубина рекурсии.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа a и b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = gcd(a, b);
        System.out.println("НОД(" + a + ", " + b + ") = " + result);

        scanner.close();
    }
}

