import java.io.FileInputStream;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/app.properties"));
        String OPEN_AI_KEY = properties.getProperty("OPEN_AI_KEY");
        //System.out.println(OPEN_AI_KEY);
    }
}
