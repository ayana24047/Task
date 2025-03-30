import java.util.Scanner;

/**
 * Класс TaskOne для нахождения минимального элемента в массиве.
 */
public class TaskOne {
    /**
     * Метод находит минимальный элемент в массиве.
     *
     * @param arr входной массив чисел
     * @return минимальное значение в массиве
     *
     * Временная сложность: O(n) - требуется один проход по массиву.
     * Пространственная сложность: O(1) - используется только одна дополнительная переменная.
     */
    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
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

        int min = findMinimum(arr);
        System.out.println("Минимальный элемент: " + min);

        scanner.close();
    }
}

