package test;

import main.bouquets.Bouquet;
import main.flowers.*;
import org.junit.jupiter.api.*;


public class bouquetTest {
    private final Flower fl1 = new RedRose(Freshness.FullFresh, 10);
    private final Flower fl2 = new WhiteRose(Freshness.MidFresh, 10);
    private final Flower fl3 = new YellowTulip(Freshness.OldFresh, 10);
    @Test
    public void sortFlowersByFreshTest(){

        Bouquet expected = new Bouquet();
        expected.addFlower(fl1);
        expected.addFlower(fl2);
        expected.addFlower(fl3);

        Bouquet actual = new Bouquet();
        actual.addFlower(fl1);
        actual.addFlower(fl3);
        actual.addFlower(fl2);
        actual.sortFlowersByFresh();

        Assertions.assertEquals(expected.getFlowers(), actual.getFlowers());
    }
}
