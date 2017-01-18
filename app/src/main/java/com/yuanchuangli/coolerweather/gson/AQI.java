package com.yuanchuangli.coolerweather.gson;

/**
 * @author Balnk
 * @description AQI
 * @time 2017/1/18 10:13
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
