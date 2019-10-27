package musicalentity;

/**
 *
 */
import musicalenums.AlbumType;

import java.util.Collections;
import java.util.SortedSet;
import java.util.Date;

public class Album {
    private String artist;
    private Date date;
    private AlbumType type;
    private SortedSet<Track> tracks;

    public Album(String artist, Date date, AlbumType type, SortedSet<Track> tracks)
    {
        this.artist = artist;
        this.date = date;
        this.type = type;
        this.tracks = tracks;
    }

    public String getArtist()
    {
        return this.artist;
    }

    public Date getDate()
    {
        return this.date;
    }

    public AlbumType getType()
    {
        return this.type;
    }

    public SortedSet<Track> getTracks() {
        return Collections.unmodifiableSortedSet(this.tracks);
    }

    public void setTracks(SortedSet<Track> tracks) {
        this.tracks = tracks;
    }
}

