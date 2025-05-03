// An anonymous inner class is a local class without a name.
// It's instantiated and declared at the same time — usually for one-time use.
// Can't define a constructor in anonymous inner classes
// Can't be reused (no class name)
// Always created using a reference to a superclass or interface

interface Greeting {
    void sayHello();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Greeting grt = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, Anonymous World!");
            }
        };
        grt.sayHello();
    }
}
