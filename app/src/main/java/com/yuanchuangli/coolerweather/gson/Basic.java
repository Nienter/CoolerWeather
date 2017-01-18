package com.yuanchuangli.coolerweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Balnk
 * @description Basic
 * @time 2017/1/18 10:06
 */

public class Basic {
    @SerializedName("city")
    public String citName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
