package thws.de.Lektion16.Uebung2.muenzautomat;

public class ChangeCalculatorNew implements ChangeCalculator {

  private static final int[] MUENZWERTE = {1, 2, 5, 10, 20, 50, 100, 200}; // in Cent

  @Override
  public int[] getChange(int euros, int cent) {
    int[] rueckgabe = new int[8];
    int gesamt = euros * 100 + cent;

    for (int i = MUENZWERTE.length - 1; i >= 0; i--) {
      rueckgabe[i] = gesamt / MUENZWERTE[i];
      gesamt %= MUENZWERTE[i];
    }

    return rueckgabe;
  }
}
