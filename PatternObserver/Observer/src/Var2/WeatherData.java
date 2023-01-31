package Var2;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class WeatherData extends Observable {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()  {
        observers = new ArrayList();
    }



    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float
            pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
