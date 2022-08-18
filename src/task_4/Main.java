package task_4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 30; i++){
            num.add(i);
        }
//        for (int i : num){
//            i += 1;
//            System.out.println(i);
//        }

        ListIterator<Integer> listIterator = num.listIterator();

        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            System.out.println(integer + 1);
        }
    }
}
