package helloWorld;
import java.io.IOException;
import com.github.lalyos.jfiglet.FigletFont;

public class App {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("HelloWorld ");
        System.out.println(asciiArt);
    }
}
