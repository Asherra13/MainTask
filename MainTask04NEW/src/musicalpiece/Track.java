package musicalpiece;

import musicalenums.CompressionType;
import musicalenums.StyleType;

public class Track extends Composition{
    private CompressionType compression;
    private long duration;
    //private int position;

    public Track(String title, String composer, StyleType style, String iswc, CompressionType compression, long duration)
    {
        super(title, composer, style, iswc);
        this.compression = compression;
        this.duration = duration;
    }

    public CompressionType getCompression()
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
