public class SalonItem {
    String name;
    String model;
    int year;
    int price;
    public SalonItem(String name,
                    String model,
                    int year,
                    int price)
    {
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public SalonItem() {
    }

    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }
}

