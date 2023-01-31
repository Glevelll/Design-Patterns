import java.io.*;

public class t2 {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\Глеб\\IdeaProjects\\ooa2\\src\\text.txt")));
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static class LowerCaseInputStream extends FilterInputStream {
        public LowerCaseInputStream(InputStream in) {
            super(in);
        }
        public int read() throws IOException {
            int c = in.read();
            return (c == -1 ? c : Character.toLowerCase((char)c));
        }

        public int read(byte[] b, int offset, int len) throws IOException {
            int result = in.read(b, offset, len);
            for (int i = offset; i < offset+result; i++) {
                b[i] = (byte)Character.toLowerCase((char)b[i]);
            }
            return result;
        }
    }
}
