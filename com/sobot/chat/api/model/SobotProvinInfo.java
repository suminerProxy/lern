package com.sobot.chat.api.model;

import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotProvinInfo implements Serializable {
    public List<SobotProvinceModel> areas;
    public List<SobotProvinceModel> citys;
    public List<SobotProvinceModel> provinces;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SobotProvinceModel implements Serializable {
        public String areaId;
        public String areaName;
        public String cityId;
        public String cityName;
        public boolean isChecked;
        public int level;
        public boolean nodeFlag;
        public String provinceId;
        public String provinceName;

        public String toString() {
        }
    }

    public List<SobotProvinceModel> getAreas() {
    }

    public List<SobotProvinceModel> getCitys() {
    }

    public List<SobotProvinceModel> getProvinces() {
    }

    public void setAreas(List<SobotProvinceModel> list) {
    }

    public void setCitys(List<SobotProvinceModel> list) {
    }

    public void setProvinces(List<SobotProvinceModel> list) {
    }
}
