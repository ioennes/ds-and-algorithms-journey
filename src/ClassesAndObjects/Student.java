package ClassesAndObjects;

// This code shows us how to create the class student, the parent class
// of GradStudent and a class that is used in Registrar.
public class Student {

    // Object characteristics encoded in instance fields.
    // We have three visibility modifiers:
    //                          public (available for all classes)
    //                          protected (available to all child classes)
    //                          private (available only to the class it's in)
    protected String name;
    protected String id;
    protected float gpa;

    // Constructor: this is what initializes the object.

    public Student(String name, String id, float gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public Student() {
        this.name = null;
        this.id = null;
        this.gpa = 0.0F;
    }

    // A major pillar of OOP is encapsulation, this is represented by
    // creating accessors and mutators. They help in finding bugs too.

    // Mutators

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    // Accessors

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public float getGpa() {
        return gpa;
    }

    // toString

    public String toString() {
        return name + " " + id + " " + gpa;
    }
}
