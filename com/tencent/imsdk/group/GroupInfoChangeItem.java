package com.tencent.imsdk.group;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupInfoChangeItem implements Serializable {
    private boolean boolValueChanged;
    private String customInfoKey;
    private int groupInfoChangeType;
    private int intValueChanged;
    private String valueChanged;

    public boolean getBoolValueChanged() {
        return this.boolValueChanged;
    }

    public String getCustomInfoKey() {
        return this.customInfoKey;
    }

    public int getGroupInfoChangeType() {
        return this.groupInfoChangeType;
    }

    public int getIntValueChanged() {
        return this.intValueChanged;
    }

    public String getValueChanged() {
        return this.valueChanged;
    }

    public void setCustomInfoKey(String str) {
        this.customInfoKey = str;
    }

    public void setGroupInfoChangeType(int i2) {
        this.groupInfoChangeType = i2;
    }

    public void setValueChanged(String str) {
        this.valueChanged = str;
    }
}
