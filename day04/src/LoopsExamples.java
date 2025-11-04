import java.util.Scanner;

public class LoopsExamples {
    public static void main(String[] args) {
        System.out.println("➡️ Цикл for (1 до 10):");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("➡️ Цикл while (сумма от 1 до N):");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Сумма от 1 до " + n + " = " + sum + "\n");

        System.out.println("➡️ Цикл do-while (ввод до 0):");
        int number;
        do {
            System.out.print("Введите число (0 для выхода): ");
            number = scanner.nextInt();
        } while (number != 0);
        System.out.println("Выход из цикла.\n");

        System.out.println("➡️ Чётные числа от 1 до 100:");
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) System.out.print(j + " ");
        }
        System.out.println("\n");

        System.out.println("➡️ Факториал числа:");
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int k = 1; k <= num; k++) {
            factorial *= k;
        }
        System.out.println("Факториал " + num + " = " + factorial + "\n");

        System.out.println("➡️ Треугольник из *:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

