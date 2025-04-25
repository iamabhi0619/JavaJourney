//Inheritance is a mechanism where
//one class (child) acquires properties and behaviors (fields and methods) of another class (parent).

class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name + ", and i am " + age + "years old.");
    }
}

class Student extends Person {
    int rollNumber;

    void study() {
        System.out.println("I am studying and my roll number is " + rollNumber + ".");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhishek Kumar";
        s1.age = 22;
        s1.rollNumber = 12303842;
        s1.introduce();
        s1.study();
    }
}
