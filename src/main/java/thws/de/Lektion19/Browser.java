package thws.de.Lektion19;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser {

    public Optional<URL> back() {
        try {
            return Math.random() < 0.5
                ? Optional.of(new URL("http://google.de"))
                : Optional.empty();
        } catch (MalformedURLException e) {
            return Optional.empty();
        }
    }

    public String retrieveSite(URL url) {
        return url.toString();
    }

    public static void main(String[] args) {
        System.out.println("Optional back");
        Browser browser = new Browser();

        browser.back().ifPresent(url -> {
            String site = browser.retrieveSite(url);
             System.out.println("Geladene Seite: " + site);
        });
    }
}

