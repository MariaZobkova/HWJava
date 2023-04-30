import java.util.Scanner;
import java.util.*;
public class task5 {


    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in); //Петров Илья Романович 56 М

        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> surname2 = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        String in = scan.nextLine();
        int i = 0;

        while (!in.equals("q")){
            System.out.println(in);
            String[] people = new String[5];
            people = in.split(" ");
            list1.add(in);
            surname.add(people[0]);
            name.add(people[1]);
            surname2.add(people[2]);
            age.add(Integer.parseInt(people[3]));
            gender.add(people[4]);
            id.add(i);
            in = scan.nextLine();
            i ++;
        }

/*        System.out.println(surname);
        System.out.println(name);
        System.out.println(surname2);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(id);*/

        // Сортровка по возрасту
        int temp = 0;

        for (int j = 0; j < age.size() - 1; j++){
            for (int g = 0; g < age.size() - 1 - j; g++) {
                if (age.get(g) >= age.get(g + 1)) {
                    temp = age.get(g);
                    age.set(g, age.get(g + 1));
                    age.set(g + 1, temp);

                    temp = id.get(g);
                    id.set(g, id.get(g + 1));
                    id.set(g + 1, temp);

                }
            }
        }
/*        System.out.println("\nПосле сортировки:");
        System.out.println(surname);
        System.out.println(name);
        System.out.println(surname2);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(id);*/

        for (int z: id){
            System.out.println(list1.get(z));
        }
    }

//    private static void sortIndexesByIntList(ArrayList<Integer> arrayToSort, LinkedList<Integer> ind) {
//        ArrayList<Integer> arr = new ArrayList<>(arrayToSort);
//
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.size() - 1; j++) {
//                if (arr.get(j) > arr.get(j + 1)) {
//                    int tmp = ind.get(j);
//                    ind.set(j, ind.get(j + 1));
//                    ind.set(j + 1, tmp);
//
//                    tmp = arr.get(j);
//                    arr.set(j, arr.get(j + 1));
//                    arr.set(j + 1, tmp);
//                }
//            }
//        }
//    }
}