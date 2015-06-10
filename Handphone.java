package com.company;

/**
 * Created by Yolland on 6/10/2015.
 */
public class Handphone {

    public String Samsung;
    public String SamsungGalaxy;
    public String SamsungGrand;

    public Handphone(String samsung, String samsungGalaxy, String samsungGrand) {
        Samsung = samsung;
        SamsungGalaxy = samsungGalaxy;
        SamsungGrand = samsungGrand;
    }

    public String getSamsung() {
        return Samsung;
    }

    public void setSamsung(String samsung) {
        Samsung = samsung;
    }

    public String getSamsungGalaxy() {
        return SamsungGalaxy;
    }

    public void setSamsungGalaxy(String samsungGalaxy) {
        SamsungGalaxy = samsungGalaxy;
    }

    public String getSamsungGrand() {
        return SamsungGrand;
    }

    public void setSamsungGrand(String samsungGrand) {
        SamsungGrand = samsungGrand;
    }

    public String toString() {
        return "Handphone{" +
                "Samsung='" + Samsung + '\'' +
                ", SamsungGalaxy='" + SamsungGalaxy + '\'' +
                ", SamsungGrand='" + SamsungGrand + '\'' +
                '}';
    }
}