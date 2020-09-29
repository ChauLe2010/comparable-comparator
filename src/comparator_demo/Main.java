package comparator_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"The Anh",20));
        students.add(new Student(2,"Tien",25));
        students.add(new Student(3,"Hoa",23));
        students.add(new Student(4,"Nam Anh",24));
        students.add(new Student(5,"Hoa",22));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sap xep theo ten: ");
        for(Student s:students)
            System.out.println(s);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("Sap xep theo tuoi: ");
        for(Student s:students)
            System.out.println(s);

    }
}
