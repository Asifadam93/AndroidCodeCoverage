package com.esgi.codecoverage;

/**
 * Created by Asifadam93 on 23/07/2017.
 */

public class Util {

    private static Util myUtil = null;

    public static Util getInstance() {

        if (myUtil == null) {
            myUtil = new Util();
        }

        return myUtil;
    }

    public String getValue(int val) {
        return val >= 100 ? "High" : "Low";
    }

}
