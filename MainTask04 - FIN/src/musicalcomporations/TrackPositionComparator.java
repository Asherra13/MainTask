package musicalcomporations;

import java.util.Comparator;

import musicalentity.Track;

public class TrackPositionComparator implements Comparator<Track> {
    @Override
    public int compare(Track r1, Track r2) {
        return Long.compare(r1.getPosition(), r2.getPosition());
    }
}
