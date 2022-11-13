package ThucHanh.th2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Thang", 25, "Dn");
        Student st2 = new Student("Thang", 26, "Dn");
        Student st3 = new Student("Thang", 27, "Dn");
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("Set....");
        Set<Student> students = new HashSet<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
