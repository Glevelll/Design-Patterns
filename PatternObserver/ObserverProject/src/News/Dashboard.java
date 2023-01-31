package News;

class Dashboard implements Observer{
    public Show show;
    public int fps;
    public int ping;
    public int loss;

    public Dashboard(Show show){
        this.show = show;
        show.addObserver(this);
    }

    public void update(int fps, int ping, int loss) {
        this.fps = fps;
        this.ping = ping;
        this.loss = loss;
        show();
    }

    // отображение на приборной панели информации
    public void show(){
        System.out.println("FPS = " + fps + ", Ping = " + ping +
                ", Loss = " + loss);
    }

}
