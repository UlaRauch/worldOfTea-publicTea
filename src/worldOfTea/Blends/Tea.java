package worldOfTea.Blends;

public abstract class Tea implements Brewable {
    public String name;
    public String taste;
    public int brewTime;
    private double temperature;

    public Tea(String name, String taste, int brewTime, double temperature) {
        this.name = name;
        this.taste = taste;
        this.brewTime = brewTime;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void drinkTea() {
        System.out.println("This tea tastes of nothing :(");
    }
}
