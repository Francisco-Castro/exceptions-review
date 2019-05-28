import java.net.MalformedURLException;
import java.net.URL;

public class TestConnection {

    public static void main(String[] args) {
        openHttpConnection();
    }

    private static void openHttpConnection() {
        try {
            URL site = new URL("https://www.google.com/");
        } catch (MalformedURLException e) {
            System.out.println("Hey! The URL is not correct.");
            e.printStackTrace();
        }
    }

}
