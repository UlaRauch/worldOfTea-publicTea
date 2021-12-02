package worldOfTea.Blends;

import worldOfTea.Blends.Tea;

public class EarlGrey extends Tea {

    public EarlGrey() {
        super("Earl Grey", "bergamotte", 3, 100);
    }

    /*
    * TODO: how do you drink your Earl Grey?
     */

    /*
    TODO: something doesn't work here!
     */
    @Override
    public void brewTea(int time, double temperature) {
        if (time == this.brewTime && temperature == this.temperature) {
            System.out.println("Enjoy your " + name + "!");
            goodTea = true;
        } else if (time != this.brewTime && temperature != this.temperature) {
            System.out.println("Better don't drink this!");
        }
        else if (time != this.brewTime) {
            System.out.println(name + " must brew for " + this.brewTime + " minutes!");
        } else {
            System.out.println("Respect the temperature of " + this.temperature + " °C!");
        }
    }
}
