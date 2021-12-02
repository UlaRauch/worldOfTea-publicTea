package worldOfTea;

import worldOfTea.Blends.EarlGrey;
import worldOfTea.Blends.Tea;

import java.util.Scanner;

public class Teapot {
    //tea and teaBag are actually redundant, but you can't make tea without a teabag ;)
    public Tea teaBag;
    public Tea tea;
    public static int nrOfCups;

    public void chooseTeaBag(){
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Good morning! Which kind of tea do you want?");
        System.out.println("You can choose from: ");
        System.out.println("* Earl Grey");
        System.out.println("That's it. Please enter what you want:");
        name = scanner.nextLine();
        if (name.equals("Earl Grey")) {
            teaBag = new EarlGrey();
        } else {
            System.out.println("Sorry, i can't make " + name + ".");
        }
    }

    //as said before, completely redundant
    //also, this is not how things would be done. This method might return a null object.
    //TODO (Ula): write NoTeaBagException
    public Tea makeTea(int time, double temperature) {
        if (teaBag != null) {
            teaBag.brewTea(time, temperature);
            tea = teaBag;
            nrOfCups++;
        } else {
            System.err.println("NO TEABAG!");
        }
        return tea;
    }

}
