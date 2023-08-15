package ua.hillel.lessons.lesson13;

public class ContinueExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " я выполнюсь перед Continue");
            if (i > 2)
                continue;
            System.out.println("    " + i + " я выплнюсь всего два раза");
        }
    }
}
