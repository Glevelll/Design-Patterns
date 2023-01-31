package News;
import java.util.ArrayList;
import java.util.List;


class Info implements Show{
    private List observers;
    private int fps;
    private int ping;
    private int loss;

    public Info(){
        observers = new ArrayList();
    }
    @Override
    public void addObserver(News.Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(News.Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0){
            observers.remove(i);
        }
    }

    // уведомить слушателей
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++){
            Observer obs = (Observer)observers.get(i);
            obs.update(fps, ping, loss);
        }
    }

    public void changeData(int fps, int ping, int loss){
        this.fps = fps;
        this.ping = ping;
        this.loss = loss;
        notifyObserver();       // уведомляем слушателей об изменениях
    }

}