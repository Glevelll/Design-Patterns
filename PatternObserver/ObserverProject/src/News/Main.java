package News;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        Dashboard dashboard = new Dashboard(info);

        info.changeData(40, 60, 4);
        info.changeData(180, 55, 0);
        info.changeData(100, 81, 0);
    }
}