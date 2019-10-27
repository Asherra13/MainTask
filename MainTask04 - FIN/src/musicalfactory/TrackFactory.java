package musicalfactory;

import java.util.Map;

import musicalentity.Track;
import musicalexceptions.TrackInitializationException;
import musicalenums.CompressionType;
import musicalenums.StyleType;

public class TrackFactory {
    CompressionType compression;

    public TrackFactory(CompressionType compression) {
        this.compression = compression;
    }

    public Track createInstance(Map<String, String> trackInfo)
            throws TrackInitializationException {

        try {
            Track recording = new Track(
                    trackInfo.get("title"),
                    trackInfo.get("composer"),
                    StyleType.valueOf(trackInfo.get("style").toUpperCase()),
                    trackInfo.get("iswc"),
                    compression,
                    Integer.parseInt(trackInfo.get("duration")),
                    Integer.parseInt(trackInfo.get("position")));
            return recording;
        } catch (IllegalArgumentException e) {
            throw new TrackInitializationException("Could not parse initialization data");
        }
    }
}