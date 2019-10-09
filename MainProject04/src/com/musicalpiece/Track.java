package com.musicalpiece;

import com.musicalenums.Compression;
import com.musicalenums.MusicStyle;

public class Track extends Composition{
    private Compression compression;
    private long duration;
    //private int position;

    public Track(String title, String composer, MusicStyle style, String iswc, Compression compression, long duration)
    {
        super(title, composer, style, iswc);
        this.compression = compression;
        this.duration = duration;
    }

    public Compression getCompression()
    {
        return this.compression;
    }

    public long getDuration()
    {
        return this.duration;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Composition)) {
            return  false;
        }
        else if (obj == null) {
            return false;
        }
        else if (obj == this) {
            return true;
        }

        Track rec = (Track) obj;
        if (super.equals(rec) &&
            this.duration == rec.getDuration()) {
            return true;
        } else {
            return false;
        }
    }

}
