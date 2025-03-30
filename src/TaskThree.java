import java.util.Scanner;

/**
 * Класс TaskThree для проверки, является ли число простым.
 */
public class TaskThree {
    /**
     * Метод проверяет, является ли число простым.
     *
     * @param n число для проверки
     * @return true, если число простое, иначе false
     *
     * Временная сложность: O(√n) - проверяем делители до sqrt(n).
     * Пространственная сложность: O(1) - используем только несколько переменных.
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод main для запуска программы.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Composite");
        }

        scanner.close();
    }
}
