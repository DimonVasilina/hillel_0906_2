package ua.hillel.lessons;

import java.util.Collections;
import java.util.List;

public class MyStudents {

    public static void main(String[] args) {

        List<String> myStudents = new java.util.ArrayList<>(List.of(
                "Володимир Старчевський",
                "Сергій Полішевський  ",
//                "Дмитро Левченко",
//                "Ігор Клименко",
//                "Oleh Shchurko",
                "Костянтин Таламанюк",
                "Дмитро Василина"
//                "Тетяна Сокоренко"
        ));
        Collections.shuffle(myStudents);
        System.out.println(myStudents.get(0));

//
//       System.out.println(myStudents.get(new Random().nextInt(myStudents.size())));
    }
}
