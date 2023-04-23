public class task3 {

    public static void main(String[] args) {

/*       Сравнить скорость работы реплейса классов String и StringBuilder.*/

        String my_string =  """
                Ночь, улица, фонарь, аптека,
                Бессмысленный и тусклый свет.
                Живи ещё хоть четверть века —
                Всё будет так. Исхода нет.                     
                Умрёшь — начнёшь опять сначала
                И повторится всё, как встарь:
                Ночь, ледяная рябь канала,
                Аптека, улица, фонарь."""

;
        String query = "фонарь";


        double begin = System.currentTimeMillis();
        System.out.println(my_string);
        System.out.println();
        System.out.println(my_string.replace(query, "встарь"));
        double end = System.currentTimeMillis();
        System.out.println("Время: " + (end - begin));
        System.out.println();


        begin = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(my_string);
        while (sb.indexOf(query) > 0) {
            sb.replace(sb.indexOf(query), sb.indexOf(query) + query.length(), "встарь");
        }
        System.out.println(sb);
        end = System.currentTimeMillis();
        System.out.println("Время: " + (end - begin));
    }
}
