
class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name + ", and i am " + age + "years old.");
    }
}

class Student extends Person {
    int rollNumber;

    @Override
    void introduce() {
        System.out.println(
                "My name is " + name + ", I am a student of " + age + " years old, and my roll number is" + rollNumber);
    }

    void study() {
        System.out.println("I am studying and my roll number is " + rollNumber + ".");
    }
}

class Teacher extends Person {
    @Override
    void introduce() {
        System.out.println("I am " + name + " a " + age + " years old teacher..!!");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        Person p = new Person();

        p.name = "Generic Person";
        p.age = 45;

        s.name = "Abhishek Kumar";
        s.age = 22;
        s.rollNumber = 12303842;

        t.name = "Dr. Arora";
        t.age = 50;

        p.introduce();
        s.introduce();
        t.introduce();
    }
}
