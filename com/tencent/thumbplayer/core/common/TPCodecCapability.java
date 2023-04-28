package com.tencent.thumbplayer.core.common;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface TPCodecCapability {
    public static final int DEFAULT_FRAMERATE = 30;
    public static final int DEFAULT_INVALID_PARAMETER = -1;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TPACodecPropertyRange implements Serializable {
        public int level;
        public int lowerboundBitRate;
        public int lowerboundChannels;
        public int lowerboundSampleRate;
        public int profile;
        public int upperboundBitRate;
        public int upperboundChannels;
        public int upperboundSampleRate;

        public void set(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TPCodecMaxCapability implements Serializable {
        public int maxBitRate;
        public int maxChannels;
        public int maxFramerateFormaxLumaSamples;
        public int maxLevel;
        public int maxLumaSamples;
        public int maxProfile;
        public int maxSampleRate;

        @Deprecated
        public TPCodecMaxCapability(int i2, int i3, int i4) {
        }

        public TPCodecMaxCapability(int i2, int i3, int i4, int i5) {
        }

        public TPCodecMaxCapability(int i2, int i3, int i4, int i5, int i6) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TPHdrSupportVersionRange implements Serializable {
        public int lowerboundAndroidAPILevel;
        public int lowerboundPatchVersion;
        public int lowerboundSystemVersion;
        public int upperboundAndroidAPILevel;
        public int upperboundPatchVersion;
        public int upperboundSystemVersion;

        public TPHdrSupportVersionRange(int i2, int i3) {
        }

        public TPHdrSupportVersionRange(int i2, int i3, int i4, int i5) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TPVCodecPropertyRange implements Serializable {
        public int level;
        public int lowerboundHeight;
        public int lowerboundWidth;
        public int profile;
        public int upperboundHeight;
        public int upperboundWidth;

        public void set(int i2, int i3, int i4, int i5, int i6, int i7) {
        }
    }
}
