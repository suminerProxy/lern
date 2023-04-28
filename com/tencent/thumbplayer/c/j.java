package com.tencent.thumbplayer.c;

import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class j extends d implements ITPMediaDRMAsset {

    /* renamed from: a  reason: collision with root package name */
    private String f13165a;
    @TPCommonEnum.TP_DRM_TYPE
    private int b;
    private Map<String, String> c;

    public j(@TPCommonEnum.TP_DRM_TYPE int i2, String str) {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public Map<String, String> getDrmAllProperties() {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public String getDrmPlayUrl() {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public String getDrmProperty(String str, String str2) {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    @TPCommonEnum.TP_DRM_TYPE
    public int getDrmType() {
    }

    @Override // com.tencent.thumbplayer.c.d, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public int getMediaType() {
    }

    @Override // com.tencent.thumbplayer.c.d, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public String getUrl() {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public void setDrmPlayUrl(String str) {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public void setDrmProperty(String str, String str2) {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public void setDrmType(@TPCommonEnum.TP_DRM_TYPE int i2) {
    }
}
