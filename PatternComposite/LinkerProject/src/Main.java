public class Main {
    public static void main(String[] args) {
        CatalogComponent bmw = new Salon("BMW");
        CatalogComponent mercedes = new Salon("Mercedes");

        CatalogComponent allCatalogs= new Salon("Catalogs");

        allCatalogs.add(bmw);
        allCatalogs.add(mercedes);

        bmw.add(new SalonItem("BMW", "X5", 2013, 2400000));
        bmw.add(new SalonItem("BMW", "Series 5", 2019, 4300000));
        bmw.add(new SalonItem("BMW", "M5", 2021, 4700000));
        bmw.add(new SalonItem("BMW", "X8", 2017, 3500000));

        mercedes.add(new SalonItem("Mercedes", "S-Class", 2019, 4300000));
        mercedes.add(new SalonItem("Mercedes", "G-Class", 2017, 5600000));
        mercedes.add(new SalonItem("Mercedes", "A-Class", 2021, 7800000));
        mercedes.add(new SalonItem("Mercedes", "E-Class", 2018, 3700000));


        Consultant consultant = new Consultant(allCatalogs);
        consultant.printCatalog();
    }
}