package worldOfTea.Blends;

import worldOfTea.Blends.Tea;

public class EarlGrey extends Tea {

    public EarlGrey() {
        super("Earl Grey", "bergamotte", 3, 100);
    }

    @Override
    public void drinkTea() {
        System.out.println("Mmh! This tea tastes like " + taste + "!");
    }

    @Override
    public void brewTea(int time, double temperature) {
        if (time == this.brewTime && temperature == this.getTemperature()) {
            System.out.println("Enjoy your " + name + "!");
        } else if (time < this.brewTime || time > this.brewTime) {
            System.out.println(name + " must brew for " + this.brewTime + " minutes!");
        } else {
            System.out.println("Respect the temperature of " + this.getTemperature() + " °C!");
        }
    }
}
