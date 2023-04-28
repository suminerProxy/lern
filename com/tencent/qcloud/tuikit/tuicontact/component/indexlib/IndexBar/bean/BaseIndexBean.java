package com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean;

import android.text.TextUtils;
import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.suspension.ISuspensionInterface;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class BaseIndexBean implements ISuspensionInterface, Serializable {
    private String baseIndexTag;

    public String getBaseIndexTag() {
        return this.baseIndexTag;
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.suspension.ISuspensionInterface
    public String getSuspensionTag() {
        return TextUtils.isEmpty(this.baseIndexTag) ? "" : this.baseIndexTag;
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.suspension.ISuspensionInterface
    public boolean isShowSuspension() {
        return true;
    }

    public BaseIndexBean setBaseIndexTag(String str) {
        this.baseIndexTag = str;
        return this;
    }
}
