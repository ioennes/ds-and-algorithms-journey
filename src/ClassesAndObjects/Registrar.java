package ClassesAndObjects;

// This class represents a uses-a relationship. Since Student is the parent of
// GradStudent, we can use Student to represent all its subclasses.

public class Registrar {
    private Student[] students;

    public Registrar(int size) {
        students = new Student[size];
    }

    public void getStudent(int index) {
        if (index >= students.length) {
            System.out.println("No space in Registrar");
            return;
        }
        System.out.println(students[index]);
    }

    public void addStudent(Student student) {
        int i = 0;

        // While loop finds the first null and places a student inside it.

        while (i < students.length) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("Added");
                return;
            }
            i++;
        }
        System.out.println("No space in Registrar.");
    }

    public void deleteStudent(int index) {
        if (index >= students.length) {
            System.out.println("Failed");
            return;
        }
        students[index] = null;
    }

    public static void main(String[] args) {

        // This is where I create a new list of students

        Registrar MSU = new Registrar(6);
        Student s1 = new Student("John", "202202555", 3.5F);
        MSU.addStudent(s1);
        MSU.getStudent(0);
        MSU.getStudent(10);
    }
}
