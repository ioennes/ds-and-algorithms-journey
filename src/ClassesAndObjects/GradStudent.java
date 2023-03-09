package ClassesAndObjects;

// This code shows how we can inherit from other classes.
public class GradStudent extends Student {

    private String supervisor;

    // Note that the constructor is never inherited. Only members of the parent class
    // are inherited, they include methods and instance fields. The constructor of the
    // parent class can be inherited by the child class.

    public GradStudent(String name, String id, float gpa, String supervisor) {
        super(name, id, gpa);
        this.supervisor = supervisor;
    }

    // Mutator

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    // Accessor

    public String getSupervisor() {
        return supervisor;
    }
}
