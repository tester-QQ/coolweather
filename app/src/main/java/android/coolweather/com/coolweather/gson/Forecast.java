package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/18.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    public class  Temperature{
        public  String max;
        public String min;
    }
    public class  More{
        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("cond")
    public More more;
}
