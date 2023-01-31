package Var1;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers; //контейнер для наблюдателей
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) { //добавление наблюдателей в конец списка
        observers.add(o);
    }

    public void removeObserver(Observer o) { //Если наблюдатель хочет отменить регистрацию, мы просто удаляемего из списка.
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() { //оповещение наблюдателей об изменении состояния через метод update()
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() { //оповещение
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature; //получение инфы
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
