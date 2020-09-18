package com.company.pr3;

public class Hand {
    private boolean isBroken = true;

    public Hand(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public Hand() {
    }

    public void Broken() {
        if(isBroken)
        {
            System.out.print("целая");
        }
        if(!isBroken)
        {
            System.out.print("сломана");
        }

    }

    public void setBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }
}
