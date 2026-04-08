import java.util.*;

class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

class MyComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.marks - a.marks; // descending
    }
}

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(50));
        list.add(new Student(30));
        list.add(new Student(40));

        Collections.sort(list, new MyComparator());

        for(Student s : list) {
            System.out.println(s.marks);
        }
    }
}