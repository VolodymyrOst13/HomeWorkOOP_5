package task_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Галина Петрівна");
        teachers.add("Любов Михайлівна");
        teachers.add("Галина Василівна");
        teachers.add("Михайло Михайлович");
        teachers.add("Іван Васильович");

        String bestTeacher = teachers.get(2);
        String badTeacher = teachers.get(1);

        System.out.println("Моя найкраща вчителька з школи це - " + bestTeacher + "\n" + "Моя найгірша вчителька з школи це - " + badTeacher);
    }
}
