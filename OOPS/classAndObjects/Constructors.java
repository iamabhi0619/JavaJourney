class Student {
    String name;
    int rollNumber;
    char grade;
    double[] marks = new double[5];

    Student() {
        name = "Unknown";
        rollNumber = 0;
        grade = 'U';
        for (int i = 0; i < 5; i++) {
            marks[i] = 0.0;
        }
        System.out.println("Default Constructor Called");
    }

    Student(String n, int rN) {
        name = n;
        rollNumber = rN;
        grade = 'U';
        for (int i = 0; i < 5; i++) {
            marks[i] = 0.0;
        }
        System.out.println("Name and RollNumber constructor called");
    }

    Student(String n, int rN, char g, double[] m) {
        name = n;
        rollNumber = rN;
        grade = g;
        for (int i = 0; i < 5; i++) {
            marks[i] = m[i];
        }
        System.out.println("Full constructor called");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    double calculateAverage() {
        double sum = 0.0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    void updateGrade() {
        double avg = calculateAverage();
        if (avg >= 90)
            grade = 'A';
        else if (avg >= 75)
            grade = 'B';
        else if (avg >= 60)
            grade = 'C';
        else if (avg >= 40)
            grade = 'D';
        else
            grade = 'F';
    }
}

public class Constructors {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayInfo();
        s1.updateGrade();
        System.out.println(s1.calculateAverage());
        s1.displayInfo();
        Student s2 = new Student("Abhishek Kumar", 06);
        s2.displayInfo();
        s2.updateGrade();
        System.out.println(s2.calculateAverage());
        s2.displayInfo();

        double marks[] = { 98.0, 91.0, 87.0, 93.0, 89.0 };
        Student s3 = new Student("Ravi Kumar", 07, 'B', marks);
        s3.displayInfo();
        s3.updateGrade();
        System.out.println(s3.calculateAverage());
        s3.displayInfo();

    }
}
