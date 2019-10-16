package musicalcomporations;

import java.util.Comparator;

import musicalpiece.Composition;

public class CompositionComparator implements Comparator<Composition> {

    @Override
    public int compare(Composition c1, Composition c2) {

        int result = String.valueOf(c1.getIswc()).compareToIgnoreCase(String.valueOf(c2.getIswc()));

        return result;
    }

}
