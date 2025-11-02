import java.util.Scanner;

public class VariablesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        System.out.print("Enter the weight: ");
        double weight = sc.nextDouble();

        System.out.println("\n---Result---");
        System.out.println("Name: " + name);
        System.out.println("Age after 5 years: " + (age + 5));
        System.out.println("Weight after train: " + (weight - 1.2));
    }
}