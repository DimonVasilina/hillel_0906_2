package ua.hillel.lessons.lesson13.enums;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
//        goToMenu(BorderMenu.PRODUCTS);
//        System.out.println(BorderMenu.MAIN);
//        for (BorderMenu b : BorderMenu.values()) {
//            System.out.println(b);
//        }
        exampleEnum();
    }

    static void exampleEnum() {
        Scanner scanner = new Scanner(System.in);
        String page = scanner.nextLine();
        for (BorderMenu b : BorderMenu.values()) {
            if (b.name().equalsIgnoreCase(page)) {
                System.out.println("Transfer to main page");
            } else {
                System.out.println("Unknown Page");
            }
            break;
        }
    }

    static void goToMenu(BorderMenu borderMenu) {
        switch (borderMenu) {
            case MAIN:
                System.out.println("Go to main menu");
                break;
            case PRODUCTS:
                System.out.println("Go to PRODUCTS page");
                break;
            case CONTACTS:
                System.out.println("Go to CONTACTS page");
                break;
        }
    }
}
