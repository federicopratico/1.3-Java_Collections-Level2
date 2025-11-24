package Level1.Ex2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>(List.of(1,23,3,465,5,6,34,8,76,54,545,23,632));
        System.out.println("l1: " + l1);

        List<Integer> l2 = new ArrayList<>();

        for(ListIterator<Integer> it = l1.listIterator(l1.size()); it.hasPrevious();) {
            l2.add(it.previous());
        }

        System.out.println("l2: " + l2);
    }



}
