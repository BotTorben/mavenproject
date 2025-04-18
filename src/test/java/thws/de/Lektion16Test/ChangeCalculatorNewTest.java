package thws.de.Lektion16Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import thws.de.Lektion16.Uebung2.muenzautomat.*;;

public class ChangeCalculatorNewTest {

  @Test
  public void testEinfachesBeispiel() {
    ChangeCalculator calc = new ChangeCalculatorNew();
    int[] result = calc.getChange(1, 99); // 1 Euro + 99 Cent = 199 Cent

    // Erwartet: 0x1c, 2x2c, 1x5c, 0x10c, 2x20c, 1x50c, 1x1€, 0x2€
    int[] expected = {0, 2, 1, 0, 2, 1, 1, 0};
    assertArrayEquals(expected, result);
  }

  @Test
  public void testGenau2Euro() {
    ChangeCalculator calc = new ChangeCalculatorNew();
    int[] result = calc.getChange(2, 0); // exakt 2 Euro

    int[] expected = {0, 0, 0, 0, 0, 0, 0, 1}; // 1x 2-Euro-Münze
    assertArrayEquals(expected, result);
  }

  @Test
  public void testNurCent() {
    ChangeCalculator calc = new ChangeCalculatorNew();
    int[] result = calc.getChange(0, 88); // nur Centbetrag

    // 1x50c, 1x20c, 1x10c, 1x5c, 1x2c, 1x1c
    int[] expected = {1, 1, 1, 1, 1, 1, 0, 0};
    assertArrayEquals(expected, result);
  }

  @Test
  public void testKeineMuenzen() {
    ChangeCalculator calc = new ChangeCalculatorNew();
    int[] result = calc.getChange(0, 0); // 0 Euro

    int[] expected = new int[8]; // alles 0
    assertArrayEquals(expected, result);
  }
}