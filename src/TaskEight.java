import java.util.Scanner;

/**
 * Класс TaskEight для проверки, состоит ли строка только из цифр.
 */
public class TaskEight {
    /**
     * Метод проверяет, состоит ли строка только из цифр.
     *
     * @param s входная строка
     * @return true, если строка состоит только из цифр, иначе false
     *
     * Временная сложность: O(n) - требуется проверка каждого символа.
     * Пространственная сложность: O(1) - не используется дополнительная память.
     */
    public static boolean isAllDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.next();

        if (isAllDigits(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
