package src;

import java.util.Random;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        System.out.println("Выход 1 на 1! Выберите игрока:");
        System.out.println("1 — Месси");
        System.out.println("2 — Рэшфорд");
        System.out.println("3 — Фати");
        System.out.println("4 — Исак");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Random random = new Random();
        int chance = random.nextInt(100) + 1;

        switch (choice) {
            case 1 -> System.out.println("⚽ Месси идёт на ворота...");
            case 2 -> System.out.println("🔥 Рэшфорд выходит один на один...");
            case 3 -> System.out.println("💨 Фати делает рывок...");
            case 4 -> System.out.println("⚔️ Исак готовится пробить...");
            default -> System.out.println("Такого игрока нет!");
        }
        System.out.println("шанс забить" +  chance);
        if (chance >= 50) {
            System.out.println("Гоооол");
        } else {
            System.out.println("Мимо ворот");
        }
        }
    }
