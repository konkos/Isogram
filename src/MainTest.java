import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isIsogram() {
        assertTrue(Main.isIsogram("subdermatoglyphic"));
        assertTrue(Main.isIsogram("uncopyrightables"));


        assertTrue(Main.isIsogram("disgraceful"));
        assertTrue(Main.isIsogram("designatory"));

        assertTrue(Main.isIsogram("conjugated"));
        assertTrue(Main.isIsogram("complaints"));

        assertTrue(Main.isIsogram("Isogram"));

        assertFalse(Main.isIsogram("Exvakbondsjuryzwijgplicht"));//has two j's
        assertFalse(Main.isIsogram("Isograms"));

        assertTrue(Main.isIsogram(" disgraceful"));
        assertTrue(Main.isIsogram(" disgraceful "));
    }
}