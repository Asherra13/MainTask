package musicaltests.musicalcomporationstest;

import static org.junit.Assert.*;

import org.junit.Test;

import musicalcomporations.CompositionComparator;
import musicalentity.Composition;
import musicalentity.Track;
import musicalenums.StyleType;
import musicalenums.CompressionType;


public class CompositionComparatorTest {

    @Test
    public void compareTest() {
        Composition comp1 = new Track("Jello-shot", "Stringy",
                StyleType.POP, "BRBMG0300729", CompressionType.MP3, 210, 1);

        Composition comp2 = new Track("Jello-shot", "Stringy",
                StyleType.POP, "BRBMG0500436", CompressionType.MP3, 210, 2);

        CompositionComparator comparator = new CompositionComparator();
        assertTrue("must be negative", comparator.compare(comp1, comp2) < 0);
        assertTrue("must be positive", comparator.compare(comp2, comp1) > 0);
    }

    @Test
    public void compareTestEquals() {
        Composition comp1 = new Track("Jello-shot", "Stringy",
                StyleType.POP, "BRBMG0300729", CompressionType.MP3, 210, 1);
        Composition comp2 = new Track("Jello-shot", "Stringy",
                StyleType.POP, "BRBMG0300729", CompressionType.MP3, 210, 2);

        CompositionComparator comparator = new CompositionComparator();
        assertEquals("must be zero", 0, comparator.compare(comp1, comp2));
        assertEquals("must be zero", 0, comparator.compare(comp2, comp1));
    }
}
