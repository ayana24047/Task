import java.util.Scanner;

/**
 * Класс TaskFour для вычисления факториала числа с использованием рекурсии.
 */
public class TaskFour {
    /**
     * Метод рекурсивно вычисляет факториал числа.
     *
     * @param n число, для которого вычисляется факториал
     * @return факториал числа n
     *
     * Временная сложность: O(n) - выполняется n рекурсивных вызовов.
     * Пространственная сложность: O(n) - глубина рекурсии составляет n.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определён");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();

        long result = factorial(n);
        System.out.println("Факториал " + n + " равен " + result);

        scanner.close();
    }
}
