package musicalcomporations;

import java.util.Comparator;

import musicalpiece.Track;

public class TrackDurationComparator implements Comparator<Track> {

    @Override
    public int compare(Track r1, Track r2) {
        return Long.compare(r1.getDuration(), r2.getDuration());
    }

}
