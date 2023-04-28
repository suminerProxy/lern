package com.tencent.thumbplayer.api.composition;

import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPMediaAsset {
    public static final int INVALID_ID = -1;
    public static final int MEDIA_TYPE_AUDIO = 3;
    public static final int MEDIA_TYPE_AV_MIX = 1;
    public static final int MEDIA_TYPE_MUTABLE = 4;
    public static final int MEDIA_TYPE_VIDEO = 2;

    @Nullable
    ITPMediaAssetExtraParam getExtraParam();

    int getMediaType();

    String getUrl();

    void setExtraParam(@Nullable ITPMediaAssetExtraParam iTPMediaAssetExtraParam);
}
