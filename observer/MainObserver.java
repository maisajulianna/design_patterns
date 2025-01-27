public class MainObserver {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver o1 = new WeatherObserver("Observer no 1 received a new weather update. The temperature is now: ");
        WeatherObserver o2 = new WeatherObserver("Observer no 2 has been notified of new weather: ");

        weatherStation.addObserver(o1);
        weatherStation.addObserver(o2);

        Thread weatherStationThread = new Thread(weatherStation);
        weatherStationThread.start();

        try {
            Thread.sleep(15000);

            weatherStation.removeObserver(o2);

            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
