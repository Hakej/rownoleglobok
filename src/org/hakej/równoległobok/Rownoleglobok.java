package org.hakej.równoległobok;

class Rownoleglobok {
    private int width;
    private int height;
    private int kick;

    Rownoleglobok(int w, int h, int k) {
        if(areValuesValid(w, h, k)) {
            this.width = w;
            this.height = h;
            this.kick = k;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getKick() {
        return kick;
    }

    public void setKick(int kick) {
        this.kick = kick;
    }

    private Boolean areValuesValid(int w, int h, int k) {
        return (isSideValueValid(w) && isSideValueValid(h) && isKickValueValid(k));
    }

    private Boolean isSideValueValid(int s) {
        return (s > 0 && s <= 100);
    }

    private Boolean isKickValueValid(int k) {
        return (k >= -100 && k <= 100);
    }
}
