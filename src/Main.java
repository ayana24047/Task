import java.util.Scanner;

public class Main {

    /**
     * Метод для вычисления среднего значения массива.
     * @param n   количество элементов
     * @param arr массив чисел
     * @return    среднее значение (в виде double)
     *
     * Time complexity: O(n)
     */
    public static double calculateAverage(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (double) sum / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите " + n + " элементов массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        double avg = calculateAverage(n, arr);
        System.out.println(avg);
    }
}
