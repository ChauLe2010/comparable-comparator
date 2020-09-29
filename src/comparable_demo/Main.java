package comparable_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"The Anh",20));
        students.add(new Student(2,"Tien",25));
        students.add(new Student(3,"Hoa",23));
        students.add(new Student(4,"Nam Anh",24));
        students.add(new Student(5,"Hoa",22));
        Collections.sort(students);
        for(Student s:students)
            System.out.println(s);
    }


}
