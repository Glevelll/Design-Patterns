public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        Iterator iterator = program.getIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"* ");
        }
    }
}