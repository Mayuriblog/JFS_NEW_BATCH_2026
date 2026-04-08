import java.util.*;

class Student implements Comparable<Student> {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks; // ascending
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(50));
        list.add(new Student(30));
        list.add(new Student(40));

        Collections.sort(list);

        for(Student s : list) {
            System.out.println(s.marks);
        }
    }
}