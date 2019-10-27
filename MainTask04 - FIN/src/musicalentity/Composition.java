package musicalentity;

import musicalenums.StyleType;

/**
 * This class represents composition as
 */
public abstract class Composition {
    private String title;
    private String composer;
    private StyleType style;
    private String iswc; //cc-xxx-yy-nnnnn BR-BMG-03-00729

    /**
     * Creates a new Composition with the given title
     * @param title     The composition title
     * @param composer  The first and last name of the composer
     * @param style     The composition style
     * @param iswc      The composition international standard musical work code in format ccxxxyynnnnn
     */
    public Composition(String title, String composer, StyleType style, String iswc)
    {
        this.title = title;
        this.composer = composer;
        this.style = style;
        this.iswc = iswc;
    }

    /**
     * Gets the composition title
     * @return this composition title
     */
    public  String getTitle()
    {
        return  this.title;
    }

    /**
     * Gets the first and last name of the composer
     * @return this composer name
     */
    public  String getComposer()
    {
        return this.composer;
    }

    public StyleType getStyle()
    {
        return this.style;
    }

    public String getIswc()
    {
        return this.iswc;
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

        Composition rec = (Composition) obj;
        if (this.iswc == rec.getIswc()) {
            return true;
        }
        else {
            return false;
        }
    }
}