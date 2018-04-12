package com.fangwolf.coldweather.gson;

public class AQI {
    public AQICity aqiCity;

    private class AQICity {
        public String aqi;
        public String pm25;
    }
}
