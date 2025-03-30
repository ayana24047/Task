import java.util.Scanner;

/**
 * Класс TaskSix для вычисления степени числа с использованием рекурсии.
 */
public class TaskSix {
    /**
     * Метод рекурсивно вычисляет a^n.
     *
     * @param a основание
     * @param n показатель степени (должен быть >= 0)
     * @return результат возведения a в степень n
     *
     * Временная сложность: O(n) - линейное количество рекурсивных вызовов.
     * Пространственная сложность: O(n) - глубина рекурсии.
     */
    public static long power(int a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Показатель степени должен быть неотрицательным");
        }
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите основание и показатель степени:");
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        long result = power(a, n);
        System.out.println(a + " в степени " + n + " равно " + result);

        scanner.close();
    }
}

