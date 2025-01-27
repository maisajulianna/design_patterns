public class WeatherObserver implements Observer {
    private String text;

    public WeatherObserver(String text) {
        this.text = text;
    }

    @Override
    public void update(Double temperature) {
        System.out.println(text + temperature + " °C");
    }
}
