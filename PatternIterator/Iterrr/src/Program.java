import java.util.Optional;

public class Program implements Collection{
    int x1 = 1;
    boolean x1Flag = false;
    String str = "2";
    boolean strFlag = false;
    double x2 = 3.0;
    boolean x2Flag = false;
    int [] arr = new int[]{1,2,3,4,5,6,-7,-8,-9,10};
    boolean arrFlag = false;

    public Program(){
    }

    @Override
    public Iterator getIterator() {
        return new Iterator1();
    }

    private class Iterator1 implements Iterator{
        @Override
        public boolean hasNext() {
            return !arrFlag;
        }

        @Override
        public Object next() {
            if (!x1Flag) {
                x1Flag = true;
                return x1;
            } else if (!strFlag) {
                strFlag = true;
                return str;
            } else if (!x2Flag) {
                x2Flag = true;
                return x2;
            } else if (!arrFlag) {
                arrFlag = true;
                return out(arr);
            }
            return Optional.empty();
        }

        public Object out(int [] arr){
            int n = arr.length;
            for (int j : arr) {
                System.out.print(j + " ");
            }
            return "";
        }
    }
}
