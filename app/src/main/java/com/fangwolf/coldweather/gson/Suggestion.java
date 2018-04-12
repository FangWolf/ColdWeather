package com.fangwolf.coldweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public ComFort comFort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    private class ComFort {
        @SerializedName("txt")
        public String info;
    }

    private class CarWash {
        @SerializedName("txt")
        public String info;
    }

    private class Sport {
        @SerializedName("txt")
        public String info;
    }
}
