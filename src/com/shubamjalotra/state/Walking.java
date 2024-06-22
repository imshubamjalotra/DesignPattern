package com.shubamjalotra.state;

import java.util.Date;

public class Walking implements TravelMode {
    @Override
    public Object getEta() {
        Date date=new Date();
        date.getTime();

        System.out.println("Calculating ETA (walking)--date"+date);
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
