/*      Реализовать алгоритм обратной сортировки списков компаратором.
        Пусть дан произвольный список целых чисел, удалить из него чётные числа
        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        Повторить пятый пункт но с LinkedList.
        Сравнить время работы пятого и шестого пунктов.*/

import java.util.*;
import java.util.Collections;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class task4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(new Random().nextInt(0, 20));
        }
        System.out.println(list);

        //Реализовать алгоритм обратной сортировки списков компаратором.

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        // Пусть дан произвольный список целых чисел, удалить из него чётные числа

        System.out.println(removeNum(list));

        //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

        System.out.println("Максимальное значение в списке " + Collections.max(list));
        System.out.println("Минимальное значение в списке " + Collections.min(list));

        int sum = 0;
        for (int n: list){
            sum = sum + n;
        }int avg = sum/ list.size();

        ArrayList<Integer> list5 = new ArrayList<>();
        for (int c = 0; c < list.size(); c++){
            list5.add(abs(list.get(c) - avg));
        }
        int index = list5.indexOf(Collections.min(list5));
        System.out.println("Среднее значение списка " + list.get(index));

        // Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int a = 0; a < 5; a++) {
            list2.add(new Random().nextInt(0, 20));
        }
        System.out.println(list2);

        list2.removeAll(list);
        list.addAll(list2);
        System.out.println(list);

        //Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        //Повторить пятый пункт но с LinkedList.
        //Сравнить время работы пятого и шестого пунктов.

        double start = System.currentTimeMillis();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int b = 0; b < 10001; b++) {
            list3.add(0,0);}
        double finish = System.currentTimeMillis();
        System.out.println("Время " + (finish-start));

        start = System.currentTimeMillis();
        LinkedList<Integer> list4 = new LinkedList<>();
        for (int b = 0; b < 10001; b++) {
            list4.add(0,0);}
        finish = System.currentTimeMillis();
        System.out.println("Время " + (finish-start));


    }

    static ArrayList removeNum(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            if ((list.get(j)) % 2 != 0) {
                list1.add(list.get(j));

            }
        }
        return list1;

    }


}

