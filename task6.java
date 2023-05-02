import java.util.HashMap;
import java.util.Objects;

/*Создать множество, ключь и значение строки. Добавить шесть элементов. Вывести в консоль значения. Добавить ко всем значениям символ "!".
        Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого.
        Объеденить значания во втором множестве и первом если ключи совподают. Вывести результат в консоль*/
public class task6 {
    public static void main(String[] args) {

        HashMap<String, String> price = new HashMap<>();

        price.put("Яблоки", "45.5");
        price.put("Апельсины", "89.0");
        price.put("Киви", "65.5");
        price.put("Бананы", "120.0");
        price.put("Слива", "45.0");
        price.put("Груша", "56.4");

        for (String num: price.values()
             ) {
            System.out.println(num);

        }

        for (String frut: price.keySet()
             ) {
            price.compute(frut, (k, v) -> v+"!");

        }
        for (String num: price.values()
        ) {
            System.out.println(num);

        }

        HashMap<String, String> price2 = new HashMap<>();

        price2.put("Яблоки", "49.5");
        price2.put("Апельсины", "99.0");
        price2.put("Арбуз", "300.0");
        price2.put("Дыня", "500.0");
        price2.put("Черешня", "45.0");
        price2.put("Груша", "56.0");


        for (String frut1: price.keySet()
        ) {
                if (price2.containsKey(frut1)) {
                    price2.merge(frut1, price.get(frut1), String::concat);
                }


        }

        for (String num: price2.values()
        ) {
            System.out.println(num);

        }







    }
}
