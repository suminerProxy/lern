package com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class BaseIndexPinyinBean extends BaseIndexBean {
    private String baseIndexPinyin;

    public String getBaseIndexPinyin() {
        return this.baseIndexPinyin;
    }

    public abstract String getTarget();

    public boolean isNeedToPinyin() {
        return true;
    }

    public BaseIndexPinyinBean setBaseIndexPinyin(String str) {
        this.baseIndexPinyin = str;
        return this;
    }
}
