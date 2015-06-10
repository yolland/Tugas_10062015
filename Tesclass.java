package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Yolland on 6/10/2015.
 */
public class Tesclass {

    public static void main (String[] args) {

        Pencipta Hp = new Pencipta("LeebyungChul","KoreaSelatan");
        System.out.println(Hp.toString());
        Handphone Samsung = new Handphone("Dous","Mini","Grand");
        System.out.println(Samsung.toString());
    }
}
