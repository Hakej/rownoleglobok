package org.hakej.równoległobok;

class Równoległobok {
    public int width;
    public int height;
    public int kick;

    Równoległobok(int w, int h, int k) {
        if(areValuesValid(w, h, k)) {
            this.width = w;
            this.height = h;
            this.kick = k;
        }
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
