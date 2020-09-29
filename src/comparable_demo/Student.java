package comparable_demo;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student["+id+","+name+","+age+"]";
    }


    @Override
    public int compareTo(Student o) {
        if(this.getName().compareTo(o.getName())==0)
            return this.getAge()-o.getAge();
        return this.getName().compareTo(o.getName());

    }
}
