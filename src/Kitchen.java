import worldOfTea.*;
import worldOfTea.Blends.EarlGrey;
import worldOfTea.Blends.Tea;

public class Kitchen {

    public static void main(String[] args) {
        //TODO: follow the steps!
        // 1. You need a teapot!
        Teapot teapot = new Teapot();

        // 2. Of course, you can't make tea without a tea bag *

        // 3. make yourself a cupOfTea (take care to use the right temperature and brewing time!)

        // 4. This cup does not exist yet
        //cupOfTea.content.drinkTea();

        // 5. check how many cups you've already had. Maybe it's time to stop?
        System.out.println(" Nr of cups so far: " + teapot.nrOfCups);
    }
}
// * yes, smartypants, you can. but loose tea does not exist in this exercise. go and find out why ;)