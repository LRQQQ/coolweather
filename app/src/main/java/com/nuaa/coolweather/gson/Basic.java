package com.nuaa.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")    //由于JSON中的一些字段可能不太合适直接作为Java字段来命名，因此加@SerializedName注解，让JSON字段和Java字段之间建立映射关系。
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
