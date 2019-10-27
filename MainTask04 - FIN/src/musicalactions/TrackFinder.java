package musicalactions;

import java.util.Set;
import java.util.TreeSet;

import musicalcomporations.TrackDurationComparator;
import musicalentity.Album;
import musicalentity.Track;

public class TrackFinder {

    public Set<Track> byDurationRange(Album album, int minDuration, int maxDuration) {

        Set<Track> result = new TreeSet<>(new TrackDurationComparator());
        for (Track rec : album.getTracks()) {
            if (minDuration <= rec.getDuration() && rec.getDuration() <= maxDuration) {
                result.add(rec);
            }
        }
        return result;
    }

}
