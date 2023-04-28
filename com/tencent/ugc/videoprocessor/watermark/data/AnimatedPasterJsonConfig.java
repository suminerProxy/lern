package com.tencent.ugc.videoprocessor.watermark.data;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AnimatedPasterJsonConfig {
    public static final String CONFIG_COUNT = "count";
    public static final String CONFIG_HEIGHT = "height";
    public static final String CONFIG_KEYFRAME = "keyframe";
    public static final String CONFIG_KEYFRAME_ARRAY = "frameArray";
    public static final String CONFIG_NAME = "name";
    public static final String CONFIG_PERIOD = "period";
    public static final String CONFIG_WIDTH = "width";
    public static final String FILE_NAME = "config.json";
    public int mCount;
    public List<PasterPicture> mFrameArray;
    public int mHeight;
    public int mKeyframe;
    public String mName;
    public int mPeriod;
    public int mWidth;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class PasterPicture {
        public static final String PICTURE_NAME = "picture";
        public String mPictureName;
    }
}
