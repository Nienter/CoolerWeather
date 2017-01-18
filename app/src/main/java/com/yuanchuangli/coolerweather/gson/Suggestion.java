package com.yuanchuangli.coolerweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Blank
 * @description Suggestion
 * @time 2017/1/18 10:17
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;

    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
