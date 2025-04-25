class Appliance {
    final void turnOn() {
        System.out.println("Appliance is on.");
    }

    String getPowerRating() {
        return "Generic rating";
    }
}

class WashingMachine extends Appliance {
    @Override
    String getPowerRating() {
        return (super.getPowerRating() + " " + "1200W");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        wm.turnOn();
        String rating = wm.getPowerRating();
        System.out.println(rating);
    }
}
