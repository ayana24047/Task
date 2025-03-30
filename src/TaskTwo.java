import java.util.Scanner;

/**
 * Класс TaskTwo для вычисления среднего арифметического элементов массива.
 */
public class TaskTwo {
    /**
     * Метод вычисляет среднее арифметическое массива.
     *
     * @param arr входной массив чисел
     * @return среднее арифметическое значений в массиве
     *
     * Временная сложность: O(n) - требуется один проход по массиву.
     * Пространственная сложность: O(1) - используется только одна дополнительная переменная.
     */
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    /**
     * Метод main для запуска программы.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Введите " + n + " элементов массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        double average = calculateAverage(arr);
        System.out.println("Среднее арифметическое: " + average);

        scanner.close();
    }
}

