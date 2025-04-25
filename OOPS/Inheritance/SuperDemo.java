class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    void displayInfo() {
        System.out.println("Name:- " + name);
        System.out.println("Age:- " + age);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof!");

    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Breed:- " + breed);
    }
}

class Cat extends Animal {
    boolean isIndoor;

    Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    void makeSound() {
        System.out.println("Meow Meow!");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Leaves Indoor:- " + isIndoor);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Tomy", 10, "Labra");
        Cat c = new Cat("Shayn", 2, true);

        d.makeSound();
        d.displayInfo();

        c.makeSound();
        c.displayInfo();
    }
}
