import java.util.Scanner;

/**
 * Класс TaskFive для вычисления n-го элемента последовательности Фибоначчи с использованием рекурсии.
 */
public class TaskFive {
    /**
     * Метод рекурсивно вычисляет n-й элемент последовательности Фибоначчи.
     *
     * @param n номер элемента в последовательности
     * @return значение n-го элемента Фибоначчи
     *
     * Временная сложность: O(2^n) - из-за экспоненциального роста количества вызовов.
     * Пространственная сложность: O(n) - глубина рекурсии.
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Метод main для запуска программы.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер элемента последовательности Фибоначчи:");
        int n = scanner.nextInt();

        long result = fibonacci(n);
        System.out.println(n + "-й элемент Фибоначчи: " + result);

        scanner.close();
    }
}
