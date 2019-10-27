package musicalactions;

import java.util.Collection;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import musicalcomporations.TrackPositionComparator;
import musicalentity.Album;
import musicalentity.Track;
import musicalenums.AlbumType;
import musicalfactory.TrackFactory;
import musicalexceptions.TrackInitializationException;


public class AlbumCreator {

    final static Logger LOGGER = LogManager.getLogger(AlbumCreator.class);
    private TrackFactory factory;

    public AlbumCreator(TrackFactory factory) {
        this.factory = factory;
    }

    public Album createAlbumFromData(String artist, AlbumType type, Collection<Map<String, String>> data) {
        Date creatingDate = new Date();
        Album album = new Album(artist, creatingDate, type, makeTracks(data));
        return album;
    }

    public SortedSet<Track> makeTracks(Collection<Map<String, String>> data) {

        SortedSet<Track> tracks = new TreeSet<Track>(new TrackPositionComparator());

        for (Map<String, String> trackInfo : data) {
            try {
                tracks.add(factory.createInstance(trackInfo));
            } catch (TrackInitializationException e) {
                LOGGER.error("Could not create recording. Skipping to the next one");
            }
        }
        return tracks;
    }
}
