import java.util.Scanner;

/**
 * Класс TaskNine для вычисления биномиального коэффициента C(n, k) с использованием рекурсии.
 */
public class TaskNine {
    /**
     * Метод рекурсивно вычисляет биномиальный коэффициент C(n, k).
     *
     * @param n общее количество элементов
     * @param k количество выбираемых элементов
     * @return значение биномиального коэффициента C(n, k)
     *
     * Временная сложность: O(2^n) - экспоненциальная сложность из-за рекурсивных вызовов.
     * Пространственная сложность: O(n) - глубина рекурсии.
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n и k:");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = binomialCoefficient(n, k);
        System.out.println("Биномиальный коэффициент C(" + n + ", " + k + ") = " + result);

        scanner.close();
    }
}
