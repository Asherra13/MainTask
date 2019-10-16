package musicalactions;

import musicalpiece.Album;
import musicalpiece.Track;
import musicalcomporations.CompositionComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class MusicSorter {
    public static void byStyle(Album album) {
        SortedSet<Track> recordings = new TreeSet<>(new CompositionComparator());
        recordings.addAll(album.getTracks());
        album.setTracks(recordings);
    }
}
