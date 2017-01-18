package com.yuanchuangli.coolerweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Blank
 * @description Now
 * @time 2017/1/18 10:15
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
