package thws.de.Lektion19Test;

import thws.de.Lektion19.Browser;

import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class BrowserTest {

    @Test
    public void testBackReturnsOptional() {
        Browser browser = new Browser();
        Optional<URL> result = browser.back();

        assertNotNull(result); 
    }

    @Test
    public void testRetrieveSiteWithPresentUrl() {
        Browser browser = new Browser();
        Optional<URL> optionalUrl = Optional.ofNullable(getTestUrl());

        String content = optionalUrl
                .map(browser::retrieveSite)
                .orElse("No site");

        assertTrue(content.contains("http://test.de"));
    }

    private URL getTestUrl() {
        try {
            return new URL("http://test.de");
        } catch (Exception e) {
            return null; 
        }
    }
}
