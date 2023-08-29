package ua.hillel.lessons;

import java.util.*;

public class MyStudents {

    public static void main(String[] args)  {

        List<String> myStudents = new java.util.ArrayList<>(List.of(
//                "Володимир Старчевський",
//                "Сергій Полішевський  ",
//                "Дмитро Левченко",
//                "Ігор Клименко",
//                "Oleh Shchurko",
//                "Костянтин Таламанюк",
//                "Дмитро Василина",
//                "Тетяна Сокоренко"
                "Карина"
        ));
        Collections.shuffle(myStudents);
            System.out.println(myStudents.get(0));

//
//       System.out.println(myStudents.get(new Random().nextInt(myStudents.size())));


//        Iterator<String> students = myStudents.iterator();
//        while (students.hasNext()) {
//            System.out.println(students.next());
//        }


//        Пользователю должно быть предложены выбрать доп. ингредиенты для бургера(стоимость бургера - 50)
//        с указанием цен! (1.Соус - 10, 2.Сыр - 20, 3.котлета - 30). После того, как пользователь ввёл доп. ингредиенты в
//        консоль(или название или номер), спросить хочет ли пользователь добавить 2-й ингредиент, если он вводит "нет",
//                тогда вывести в консоль стоимость бургера с доп. ингредиентом(-ами)!

    }
}
