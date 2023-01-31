public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();
        BMW bmw = new BMW();
        Consultant consultant = new Consultant(mercedes, bmw);
        consultant.printCatalog();
    }
}