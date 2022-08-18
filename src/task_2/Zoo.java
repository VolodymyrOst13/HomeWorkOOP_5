package task_2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0,"Elephant");
        animals.add(1,"Pig");
        animals.add(2,"Dog");
        animals.add(3,"Cat");
        animals.add(4,"Flamingo");
        animals.add(5,"Pinguin");
        animals.add(6,"Cow");
        animals.add(7,"Fox");

        for (String zoo : animals){
            System.out.println(zoo);
        }
    }
}
