import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк - list A");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i != 5; i++) {
            String str = scan.nextLine();
            listA.add(str);
        }
        System.out.println(listA);

        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк - list B");
        for (int i = 0; i != 5; i++) {
            String str = scan.nextLine();
            listB.add(str);
        }
        System.out.println(listB);

        System.out.println("-----------------------------------------------");
        Collections.reverse(listB);
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println(listC);

        Comparator<String> comparator = (o1,o2) -> o1.length() - o2.length();
        Collections.sort(listC, comparator);
        System.out.println("Отсортированный список по длине:");
        System.out.println(listC);
    }
}