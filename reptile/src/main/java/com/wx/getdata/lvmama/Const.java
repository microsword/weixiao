package com.wx.getdata.lvmama;

/**
 * Created by jianhu on 2017/1/4.
 */
public class Const {

    public static int getCityId(String cityname){

        int cityid=0;

        if (cityname.equals("杭州")) {
            cityid = 3501;

        } else if (cityname.equals("宁波")) {
            cityid = 3502;

        } else if (cityname.equals("温州")) {
            cityid = 3503;

        } else if (cityname.equals("嘉兴")) {
            cityid = 3504;

        } else if (cityname.equals("湖州")) {
            cityid = 3505;

        } else if (cityname.equals("绍兴")) {
            cityid = 3506;

        } else if (cityname.equals("金华")) {
            cityid = 3507;

        } else if (cityname.equals("衢州")) {
            cityid = 3508;

        } else if (cityname.equals("舟山")) {
            cityid = 3509;

        } else if (cityname.equals("台州")) {
            cityid = 3510;

        } else if (cityname.equals("丽水")) {
            cityid = 3511;

        } else {
            cityid = 3501;

        }

 return cityid;

    }

}
