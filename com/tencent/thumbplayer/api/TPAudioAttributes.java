package com.tencent.thumbplayer.api;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;
import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPAudioAttributes {
    @TPNativeKeyMap.MapTPAudioAttributeContentType(3)
    public static final int TP_CONTENT_MOVIE = 3;
    @TPNativeKeyMap.MapTPAudioAttributeContentType(2)
    public static final int TP_CONTENT_MUSIC = 2;
    @TPNativeKeyMap.MapTPAudioAttributeContentType(4)
    public static final int TP_CONTENT_SONIFICATION = 4;
    @TPNativeKeyMap.MapTPAudioAttributeContentType(1)
    public static final int TP_CONTENT_SPEECH = 1;
    @TPNativeKeyMap.MapTPAudioAttributeContentType(0)
    public static final int TP_CONTENT_UNKNOWN = 0;
    @TPNativeKeyMap.MapTPAudioAttributeFlag(1)
    public static final int TP_FLAG_AUDIBILITY_ENFORCED = 1;
    @TPNativeKeyMap.MapTPAudioAttributeFlag(16)
    public static final int TP_FLAG_HW_AV_SYNC = 16;
    @TPNativeKeyMap.MapTPAudioAttributeFlag(256)
    public static final int TP_FLAG_LOW_LATENCY = 256;
    private static final int TP_FLAG_PUBLIC = 273;
    @TPNativeKeyMap.MapTPAudioAttributeFlag(0)
    public static final int TP_FLAG_UNKNOWN = 0;
    @TPNativeKeyMap.MapTPAudioAttributeStreamType(4)
    public static final int TP_STREAM_ALARM = 4;
    @TPNativeKeyMap.MapTPAudioAttributeStreamType(8)
    public static final int TP_STREAM_DTMF = 8;
    @TPNativeKeyMap.MapTPAudioAttributeStreamType(3)
    public static final int TP_STREAM_MUSIC = 3;
    @TPNativeKeyMap.MapTPAudioAttributeStreamType(5)
    public static final int TP_STREAM_NOTIFICATION = 5;
    @TPNativeKeyMap.MapTPAudioAttributeStreamType(2)
    public static final int TP_STREAM_RING = 2;
    @TPNativeKeyMap.MapTPAudioAttributeStreamType(1)
    public static final int TP_STREAM_SYSTEM = 1;
    @TPNativeKeyMap.MapTPAudioAttributeStreamType(-1)
    public static final int TP_STREAM_UNKNOWN = -1;
    @TPNativeKeyMap.MapTPAudioAttributeStreamType(0)
    public static final int TP_STREAM_VOICE_CALL = 0;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(4)
    public static final int TP_USAGE_ALARM = 4;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(11)
    public static final int TP_USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(12)
    public static final int TP_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(13)
    public static final int TP_USAGE_ASSISTANCE_SONIFICATION = 13;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(16)
    public static final int TP_USAGE_ASSISTANT = 16;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(14)
    public static final int TP_USAGE_GAME = 14;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(1)
    public static final int TP_USAGE_MEDIA = 1;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(5)
    public static final int TP_USAGE_NOTIFICATION = 5;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(9)
    public static final int TP_USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(8)
    public static final int TP_USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(7)
    public static final int TP_USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(10)
    public static final int TP_USAGE_NOTIFICATION_EVENT = 10;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(6)
    public static final int TP_USAGE_NOTIFICATION_RINGTONE = 6;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(0)
    public static final int TP_USAGE_UNKNOWN = 0;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(2)
    public static final int TP_USAGE_VOICE_COMMUNICATION = 2;
    @TPNativeKeyMap.MapTPAudioAttributeUsage(3)
    public static final int TP_USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    private static final HashMap<Integer, Integer> mMapContentTypeToAndroidMediaContentType = null;
    private static final HashMap<Integer, String> mMapContentTypeToString = null;
    private static final HashMap<Integer, Integer> mMapUsageToAndroidMediaStreamType = null;
    private static final HashMap<Integer, Integer> mMapUsageToAndroidMediaUsage = null;
    private static final HashMap<Integer, String> mMapUsageToString = null;
    private int mContentType;
    private int mFlags;
    private int mUsage;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Builder {
        private static final HashMap<Integer, Integer> mMapStreamTypeToContentType = null;
        private static final HashMap<Integer, Integer> mMapStreamTypeToUsage = null;
        private int mContentType;
        private int mFlags;
        private int mUsage;

        public Builder addFlags(int i2) {
        }

        public TPAudioAttributes build() {
        }

        public Builder setContentType(@TPAudioAttributeContentType int i2) {
        }

        public Builder setFlag(int i2) {
        }

        public Builder setLegacyStreamType(@TPAudioAttributeStreamType int i2) {
        }

        public Builder setUsage(@TPAudioAttributeUsage int i2) {
        }
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface TPAudioAttributeContentType {
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface TPAudioAttributeFlag {
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface TPAudioAttributeStreamType {
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface TPAudioAttributeUsage {
    }

    private TPAudioAttributes() {
    }

    public /* synthetic */ TPAudioAttributes(AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ int access$102(TPAudioAttributes tPAudioAttributes, int i2) {
    }

    public static /* synthetic */ int access$202(TPAudioAttributes tPAudioAttributes, int i2) {
    }

    public static /* synthetic */ int access$302(TPAudioAttributes tPAudioAttributes, int i2) {
    }

    public static /* synthetic */ HashMap access$400() {
    }

    public static /* synthetic */ HashMap access$500() {
    }

    private static int contentTypeToAndroidMediaContentType(@TPAudioAttributeContentType int i2) {
    }

    public static String contentTypeToString(@TPAudioAttributeContentType int i2) {
    }

    private static int flagsToAndroidMediaFlags(int i2) {
    }

    public static int usageToAndroidMediaStreamType(@TPAudioAttributeUsage int i2) {
    }

    private static int usageToAndroidMediaUsage(@TPAudioAttributeUsage int i2) {
    }

    public static String usageToString(@TPAudioAttributeUsage int i2) {
    }

    @TPAudioAttributeContentType
    public int getContentType() {
    }

    public int getFlags() {
    }

    @TPAudioAttributeUsage
    public int getUsage() {
    }

    @RequiresApi(api = 21)
    public AudioAttributes toAndroidMediaAudioAttributes() {
    }

    public String toString() {
    }
}
