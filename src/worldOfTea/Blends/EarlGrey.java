package worldOfTea.Blends;

import worldOfTea.Blends.Tea;

public class EarlGrey extends Tea {

    public EarlGrey() {
        super("Earl Grey", "bergamotte", 3, 100);
        nrOfCups++;
    }

    @Override
    public void drinkTea() {
        if (goodTea) {
            System.out.println("Mmh! This tea tastes like " + taste + "!");
        } else {
            System.out.println("Bfah! Who made this tea?");
        }
    }

    /**
     * compare if the brewing conditions are OK, set goodTea to appropriate value and print a comment.
     */
    @Override
    public void brewTea(int time, double temperature) {
        if (time == this.brewTime && temperature == getTemperature()) {
            System.out.println("Enjoy your " + name + "!");
            goodTea = true;
        } else if (time != this.brewTime && temperature != getTemperature()) {
            System.out.println("Better don't drink this!");
        }
        else if (time != this.brewTime) {
            System.out.println(name + " must brew for " + this.brewTime + " minutes!");
        } else {
            System.out.println("Respect the temperature of " + getTemperature() + " °C!");
        }
    }
}
