package tech.delia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BirdTest {

    @Test
    void pigeon()
    {
        Bird pigeon = new Bird(Species.PIGEON, Sex.UNKNOWN, 30);

        assertEquals(Species.PIGEON, pigeon.getSpecies());
        assertEquals(Sex.UNKNOWN, pigeon.getSex());
        assertEquals(0, pigeon.getAge());
        assertTrue(pigeon.toString().startsWith("Bird"));

        pigeon.incrementAge();
        assertEquals(1, pigeon.getAge());
    }

    @Test
    void duck()
    {
        Bird duck = new Bird(Species.DUCK, Sex.FEMALE, 70);

        assertEquals(Species.DUCK, duck.getSpecies());
        assertEquals(70, duck.getSize());
        assertEquals(2, duck.getLegsCount());
    }
}
