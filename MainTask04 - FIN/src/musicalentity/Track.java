package musicalentity;

import musicalenums.CompressionType;
import musicalenums.StyleType;

/**
 *
 */
public class Track extends Composition{
    private CompressionType compression;
    private int duration;
    private int position;

    public Track(String title, String composer, StyleType style,
                 String iswc, CompressionType compression, int duration,
                 int position)
    {
        super(title, composer, style, iswc);
        this.compression = compression;
        this.duration = duration;
        this.position = position;
    }

    public CompressionType getCompression()
    {
        return this.compression;
    }

    public int getDuration()
    {
        return this.duration;
    }

    public  int getPosition()
    {
        return this.position;
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

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + duration;
        result = 31 * result + position;

        return result;
    }

}
