
// It does not require an instance of the outer class.
// Can only access static members of the outer class.
// Often used as a helper class.

class Mobile {
    static class Battery {
        public void showCapacity() {
            System.out.println("Battery: 5000mAh");
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Mobile.Battery batt = new Mobile.Battery();
        batt.showCapacity();
    }
}
