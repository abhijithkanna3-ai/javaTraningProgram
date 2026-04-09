import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int mark;
    int id;
    Student(String name, int marks,int id ) {
        this.id =id;
        this.name = name;
        this.mark = marks;
    }

    @Override
    public int compareTo(Student s) {
        return this.mark - s.mark; 
    }

    @Override
    public String toString() {
        return name + "-" + mark+"-"+id;
    }
}

public class ComparableExample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("A", 70,1));
        students.add(new Student("B", 80,14));
        students.add(new Student("C", 60,44));

       
        Comparator<Student> byid = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return Integer.compare(a.id , b.id);
            }
        };

         Comparator<Student> bymark = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.mark - b.mark;
            }
        };

        Collections.sort(students, (a,b) ->a.mark-b.mark);
        for (Student s : students) {
            System.out.println(s);
        }


         Collections.sort(students, byid);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}