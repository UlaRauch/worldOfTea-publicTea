package worldOfTea.Blends;

public abstract class Tea implements Brewable {
    private String name;
    private String taste;
    private int brewTime;
    private double temperature;
    private boolean goodTea = false;
    private static int nrOfCups;

    public Tea(String name, String taste, int brewTime, double temperature) {
        this.name = name;
        this.taste = taste;
        this.brewTime = brewTime;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isGoodTea() {
        return goodTea;
    }

    public static int getNrOfCups() {
        return nrOfCups;
    }

    public static void countNrOfCups() {
        Tea.nrOfCups += 1;
    }

    public void setGoodTea(boolean goodTea) {
        this.goodTea = goodTea;
    }

    public void drinkTea() {
        System.out.println("This tea tastes of nothing :(");
    }
}

