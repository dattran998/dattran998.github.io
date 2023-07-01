import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[100];

        List<Student> students;
        students = new ArrayList<>();


        students.add(new Student());
        students.size();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }

        System.out.println(students.size());
        students.remove(0);


    }
}
