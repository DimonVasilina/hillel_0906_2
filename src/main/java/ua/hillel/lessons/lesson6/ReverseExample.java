package ua.hillel.lessons.lesson6;

public class ReverseExample {
    public static void main(String[] args) {
        showEqualTriangle(5);
    }

    public static void showEqualTriangle(int rowsNumber) {
        for (int i = 0; i < rowsNumber; i++) {
            for (int spaceNumber = rowsNumber; spaceNumber > i; spaceNumber--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
