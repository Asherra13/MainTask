package com.musicalpiece;


import com.musicalenums.MusicStyle;

public abstract class Composition {
    private String title;
    private String composer;
    private MusicStyle style;
    private String iswc; //cc-xxx-yy-nnnnn BR-BMG-03-00729

    public Composition(String title, String composer, MusicStyle style, String iswc)
    {
        this.title = title;
        this.composer = composer;
        this.style = style;
        this.iswc = iswc;
    }

    public  String getTitle()
    {
        return  this.title;
    }

    public  String getComposer()
    {
        return this.composer;
    }

    public MusicStyle getStyle()
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
