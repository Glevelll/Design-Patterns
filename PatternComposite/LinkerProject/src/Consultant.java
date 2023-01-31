import java.util.Iterator;

public class Consultant {
    CatalogComponent allCatalogs;

    public Consultant(CatalogComponent allCatalogs) {
        this.allCatalogs = allCatalogs;
    }

    public void printCatalog() {
        allCatalogs.print();
    }
}
