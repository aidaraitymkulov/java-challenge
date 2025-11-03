import java.util.Scanner;

public class LogicOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 20;

        if (age < 13) {
            System.out.println("Ребёнок");
        } else if (age < 18) {
            System.out.println("Подросток");
        } else if (age < 65) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пенсионер");
        }

        System.out.println("Ваш возраст" + age);
        System.out.println("Есть ли у вас права?");
        String answer = sc.nextLine();
        if (answer.equals("да")) {
            System.out.println("можете водить машину");
        } else if (answer.equals("нет") || answer.equals("забыл")) {
            System.out.println("Вы не можете водить");
        } else {
            System.out.println("Ответ не понятен");
        }
    }
}