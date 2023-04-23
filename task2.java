import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

/*      Написать метод принимающий строку, ищущий в ней основание и степень После этого расчитывающий результат
        и выводящий в консоль в консоль строку параметра + ответ. Пример строки: "Основание -12б степень 7, результат".
        Попробовать с разными входящими строками.*/

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку вида - \"Основание 127, степень 2, результат равен\": ");
        String str = in.nextLine();

        System.out.println(parse_string(str));
}

        public static String parse_string (String in_string){
            String[] strings = in_string.split(" ");
            int base = 0;
            int power = 0;
            double product = 0;
            for (int i = 0; i < strings.length; i++) {
                strings[i] = strings[i].replace(",", "");
                try {
                    Integer.parseInt(strings[i]);
                    if (base == 0) {
                        base = Integer.parseInt(strings[i]);
                    } else {
                        power = Integer.parseInt(strings[i]);
                    }

                } catch (NumberFormatException e) {
                    continue;
                }
            }
            product = Math.pow(base, power);
            return in_string + " " + String.valueOf(product);
        }
    }


