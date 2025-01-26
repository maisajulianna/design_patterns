import java.util.Random;

public class WeatherStation extends Observable {
    private Double temperature;

    public WeatherStation() {
        Random random = new Random();
        this.temperature = -30 + (30 + 30) * random.nextDouble();
        System.out.println("new weather station has opened. it is now " + this.temperature + " degrees celsius.");
    }

    public void changeWeather() {
        Random random = new Random();
        this.temperature = -30 + (30 + 30) * random.nextDouble();
        System.out.println("the weather has changed to: " + this.temperature + " degrees celcius");
    }

    public Double getTemperature() { return temperature; }
}
