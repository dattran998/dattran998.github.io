import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(1);

        System.out.println(set1);

        List<Student> students = new ArrayList<>();
        Set<Student> studentSet = new HashSet<>();
    }
}
