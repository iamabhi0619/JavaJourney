class Student {
    String name;
    int rollNumber;
    char grade;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

class BasicClassObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhishek Kumar";
        s1.rollNumber = 6;
        s1.grade = 'A';
        s1.displayInfo();
        System.out.println("===================================");

        Student s2 = new Student();
        s2.name = "Ravi Kumar";
        s2.rollNumber = 7;
        s2.grade = 'B';
        s2.displayInfo();
        System.out.println("===================================");
    }
}