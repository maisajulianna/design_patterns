import java.util.Random;

public class WeatherStation extends Observable implements Runnable {
    private Double temperature;
    Random random = new Random();

    public WeatherStation() {
        this.temperature = -30 + (30 + 30) * random.nextDouble();
        this.temperature = Math.round(this.temperature * 10.0) / 10.0;
        System.out.println("Initial weather is: " + this.temperature + " degrees celcius");
    }

    public void changeWeather() {
        Double change = random.nextBoolean() ? 1.0 : -1.0;
        this.temperature += change;
        if (this.temperature > 30) {
            this.temperature = 30.0;
        }
        if (this.temperature < -30) {
            this.temperature = -30.0;
        }
        // System.out.println("the weather has changed to: " + this.temperature + " degrees celcius");
        notifyObservers(this.temperature);
    }

    @Override
    public void run() {
        try {
            while (true) {
                int time = 1 + random.nextInt(5+1);
                Thread.sleep(time * 1000);
                changeWeather();
            }
        } catch (InterruptedException e) {
            System.out.println("WeatherStation interrupted.");
        }
    }
}
