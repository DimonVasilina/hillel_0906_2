package ua.hillel.lessons.lesson4;

import ua.hillel.lessons.lesson8.oop.Cat;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        switchConditionStr();
    }

    public static void switchConditionStr() {
        System.out.println("Введеите месяц:");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();

        switch (month) {
            case "Январь":
                System.out.println("Сегодня январь месяц!!");
                break;
            case "Март":
                System.out.println("Сегодня март месяц!!");
                break;
            case "Июль":
                System.out.println("Сегодня Июль месяц!!");
                break;
            default:
                System.out.println("Не знаю того месяца!");

        }

    }

    public static void switchCondition() {
        System.out.println("Введеите 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Вы ввели 1");
                break;
            case 2:
                System.out.println("Вы ввели 2");
                break;
            case 3:
                System.out.println("Вы ввели 3");
                break;
            default:
                System.out.println("Вы ввели незнакомое число");
        }
    }

    public static void condition() {
        System.out.println("Введеите 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Вы ввели 1");
        } else if (number == 2) {
            System.out.println("Вы ввели 2");
        } else if (number == 3) {
            System.out.println("Вы ввели 3");
        } else {
            System.out.println("Вы ввели незнакомое число");
        }
    }


}
