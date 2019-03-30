package org.hakej.rownoleglobok.Rownoleglobok;

import org.hakej.rownoleglobok.InvalidParallelogramValues.InvalidParallelogramValues;

public class Rownoleglobok {
    private Integer width;
    private Integer height;
    private Integer kick;

    public Rownoleglobok(Integer w, Integer h, Integer k) throws InvalidParallelogramValues {
        if(areValuesValid(w, h, k)) {
            this.width = w;
            this.height = h;
            this.kick = k;
        } else {
            throw new InvalidParallelogramValues();
        }
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getKick() {
        return kick;
    }

    public void setKick(Integer kick) {
        this.kick = kick;
    }

    private Boolean areValuesValid(Integer w, Integer h, Integer k) {
        return (isSideValueValid(w) && isSideValueValid(h) && isKickValueValid(k));
    }

    private Boolean isSideValueValid(Integer s) {
        return (s > 0 && s <= 100);
    }

    private Boolean isKickValueValid(Integer k) {
        return (k >= -100 && k <= 100);
    }
}
