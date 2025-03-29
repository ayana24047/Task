/**
 * Временная сложность: O(n), где n — количество элементов в массиве
 * Алгоритм проходит массив один раз, сравнивая значения.
 */

import java.util.Scanner;

public class Main {

    /**
     * Метод для нахождения минимального элемента в массиве.
     * @param n    количество элементов
     * @param arr  массив чисел
     * @return     минимальное значение в массиве
     *
     * Time complexity: O(n)
     */
    public static int findMin(int n, int[] arr) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества элементов
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Чтение массива
        System.out.println("Введите " + n + " элементов массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Вывод минимального значения
        int result = findMin(n, arr);
        System.out.println(result);
    }
}