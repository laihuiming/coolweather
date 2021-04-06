package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public String comfort;

    @SerializedName("cw")
    public String carWath;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class carWath{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
