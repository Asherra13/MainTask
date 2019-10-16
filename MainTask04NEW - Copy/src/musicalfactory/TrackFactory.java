package musicalfactory;

import java.util.Map;

import musicalpiece.Track;
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
                    Long.parseLong(trackInfo.get("duration")));
            return recording;
        } catch (IllegalArgumentException e) {
            throw new TrackInitializationException("Could not parse initialization data");
        }
    }
}