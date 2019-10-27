package musicalactions;

import musicalentity.Album;
import musicalentity.Track;
import musicalcomporations.CompositionComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class TrackSorter {
    public static void byStyle(Album album) {
        SortedSet<Track> recordings = new TreeSet<>(new CompositionComparator());
        recordings.addAll(album.getTracks());
        album.setTracks(recordings);
    }
}
