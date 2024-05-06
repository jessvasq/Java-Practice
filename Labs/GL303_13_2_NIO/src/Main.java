import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        NioExample obj = new NioExample();
        obj.usingJavaNio();

        NioExampleTwo obj2 = new NioExampleTwo();
        obj2.useNio();
    }
}