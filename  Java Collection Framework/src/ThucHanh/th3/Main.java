package ThucHanh.th3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1=new ThucHanh.th3.Student("th4",60,"QuangNam");
        Student student2=new ThucHanh.th3.Student("th1",28,"DaNang");
        Student student3=new ThucHanh.th3.Student("th2",27,"QuangNam");
        List<Student>list=new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student student:list){
            System.out.println(student.toString());
        }
        AgeComparator ageComparator=new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("compare by age");
        for (Student st:list){
            System.out.println(st.toString());
        }
    }
}
