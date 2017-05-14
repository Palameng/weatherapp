package com.example.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/14.
 */

public class AQI {
    public AQIcity city;

    public class AQIcity {
        //@SerializedName("aqi")
        public String aqi;

        //@SerializedName("pm25")
        public String pm25;
    }
}
