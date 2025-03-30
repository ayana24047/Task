import java.util.Scanner;

/**
 * Класс TaskSeven для вывода чисел в обратном порядке без использования массива.
 */
public class TaskSeven {
    /**
     * Метод рекурсивно считывает и выводит числа в обратном порядке.
     *
     * @param n количество чисел
     * @param scanner объект Scanner для ввода
     *
     * Временная сложность: O(n) - требуется n рекурсивных вызовов.
     * Пространственная сложность: O(n) - глубина рекурсии.
     */
    public static void reversePrint(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        int num = scanner.nextInt();
        reversePrint(n - 1, scanner);
        System.out.print(num + " ");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int n = scanner.nextInt();

        System.out.println("Введите " + n + " чисел:");
        reversePrint(n, scanner);

        scanner.close();
    }
}

