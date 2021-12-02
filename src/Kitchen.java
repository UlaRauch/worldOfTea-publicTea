import worldOfTea.*;
import worldOfTea.Blends.EarlGrey;

public class Kitchen {

    public static void main(String[] args) {

        //You need a teapot! Take care to use the right temperature
        Teapot teapot = new Teapot();
         //Of course you can't make tea without a tea bag *
        teapot.chooseTeaBag();
         // make yourself a cup of tea
        Cup cupOfTea = new Cup(teapot.makeTea(3, 100));
         //This cup does not exist and if it would exist, it would be empty. So go, make some tea!
         cupOfTea.content.drinkTea();
    }
}
// * yes, smartypants, you can. but loose tea does not exist in this exercise. go and find out why ;)