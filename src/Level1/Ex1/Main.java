package Level1.Ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>(List.of(
                "January", "February", "March", "April", "May", "June", "July", "September", "October", "November", "December"));

        List<Month> monthList = new ArrayList<>();

        for(ListIterator<String> it = months.listIterator(); it.hasNext();) {
            Month m = new Month(it.next());
            monthList.add(m);
        }

        System.out.println("Month's list before insertion. August is missing:");
        printCollection(monthList);
        System.out.println();

        System.out.println("Month's list before insertion. August inserted at 8th position: (The previous order doesn't change)");
        monthList.add(7, new Month("August"));
        printCollection(monthList);
        System.out.println();

        System.out.println("Creating an HashSet from Month's list: (The previous list order can change)");
        Set<Month> monthSet = new HashSet<>(monthList);
        System.out.println(monthSet);
        System.out.println();

        System.out.println("Attempt to insert an already present element:");
        System.out.println(monthSet.add(new Month("August")) ? "Operation succeed" : "Operation failed");
        System.out.println(monthSet);

    }

    static <E> void  printCollection(Collection<E> c) {
        for(E e : c) {
            System.out.println(e);
        }
    }
}
